
package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import entity.Drink;
import persistence.CocktailDBDao;
import persistence.GenericDao;
import utilities.DaoFactory;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/recipes")
public class Recipes {

    // The Java method will process HTTP GET requests
    @GET
    @Path("/{param1}/{param2}")
    //@Path("/{param1}")
    // The Java method will produce content identified by the MIME Media type "application/json"
    @Produces({"application/json"})
    public Response getMessageJason(@PathParam("param1") String mood, @PathParam("param2") String season) throws JsonProcessingException {

        GenericDao genericDao = new GenericDao(Drink.class);
        String cocktail =  genericDao.GetDrinkName(mood, season);
        if(cocktail == null) {
            return Response.status(500).entity("Status:500(Internal Server Error)").build();
        }
        String cocktailWithoutSpace = cocktail.replaceAll("\\s", "%20");

        String strIngredient1;
        String strIngredient2;
        String strIngredient3;
        String strIngredient4;
        String strIngredient5;
        String strMeasurement1;
        String strMeasurement2;
        String strMeasurement3;
        String strMeasurement4;
        String strMeasurement5;

        CocktailDBDao dao = new CocktailDBDao();

        for(DrinksItem drink : dao.getResponseDrink(cocktailWithoutSpace).getDrinks()) {
            if (drink.getStrIngredient1() == null) {
                strIngredient1 = "";
            } else {
                strIngredient1 = (String) drink.getStrIngredient1();
            }
            if (drink.getStrMeasure1() == null) {
                strMeasurement1 = "";
            } else {
                strMeasurement1 = (String) drink.getStrMeasure1();
            }

            if (drink.getStrIngredient2() == null) {
                strIngredient2 = "";
            } else {
                strIngredient2 = (String) drink.getStrIngredient2();
            }
            if (drink.getStrMeasure2() == null) {
                strMeasurement2 = "";
            } else {
                strMeasurement2 = (String) drink.getStrMeasure2();
            }

            if (drink.getStrIngredient3() == null) {
                strIngredient3 = "";
            } else {
                strIngredient3 = (String) drink.getStrIngredient3();
            }
            if (drink.getStrMeasure3() == null) {
                strMeasurement3 = "";
            } else {
                strMeasurement3 = (String) drink.getStrMeasure3();
            }

            if (drink.getStrIngredient4() == null) {
                strIngredient4 = "";
            } else {
                strIngredient4 = (String) drink.getStrIngredient4();
            }
            if (drink.getStrMeasure4() == null) {
                strMeasurement4 = "";
            } else {
                strMeasurement4 = (String) drink.getStrMeasure4();
            }

            if (drink.getStrIngredient5() == null) {
                strIngredient5 = "";
            } else {
                strIngredient5 = (String) drink.getStrIngredient5();
            }
            if (drink.getStrMeasure5() == null) {
                strMeasurement5 = "";
            } else {
                strMeasurement5 = (String) drink.getStrMeasure5();
            }

            String myOneDrink =  "Your drink is "+ drink.getStrDrink() + "\n\nIngredient are " +
                    "\n\n" + strIngredient1 + "\t" + strMeasurement1 +
                    "\n" + strIngredient2 + "\t" + strMeasurement2 +
                    "\n" + strIngredient3 + "\t" + strMeasurement3 +
                    "\n" + strIngredient4 + "\t" + strMeasurement4 +
                    "\n" + strIngredient5 + "\t" + strMeasurement5;

            return Response.status(200).entity(myOneDrink).build();
        }

        return null;
    }


}
