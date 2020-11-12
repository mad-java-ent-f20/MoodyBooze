package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import entity.Drink;
import persistence.CocktailDBDao;
import persistence.GenericDao;
import utilities.DaoFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/recipes")
public class Recipes {

    // The Java method will process HTTP GET requests
    @GET
    @Path("/{param}")
    // The Java method will produce content identified by the MIME Media type "application/json"
    @Produces({"application/json"})
    public Response getMessageJason(@PathParam("param") String inputmood) throws JsonProcessingException {
        //This should be a call to a DAO that would have a method to getByMood
        GenericDao<Drink> genericDao = DaoFactory.createDao(Drink.class);
<<<<<<< HEAD
        List<Drink> myDrinks = genericDao.getByPropertyEqual("mood", inputmood);

        CocktailDBDao dao = new CocktailDBDao();

        String StrIngredient12;
        for(DrinksItem drink : dao.getResponseDrink().getDrinks()) {
            if (drink.getStrIngredient12() == null) {
                StrIngredient12 = "";
            } else {
                StrIngredient12 = (String) drink.getStrIngredient12();
            }

                    String myOneDrink =  "Your drink is "+ drink.getStrDrink() + "\n" + StrIngredient12 + "\n" + drink.getStrIngredient2();
            return Response.status(200).entity(myOneDrink).build();
=======
        //do so
        List<Drink> myDrinks = genericDao.getByPropertyEqual(mood, mood);

        //go through the list of drinks that match the mood & return them
        for (Drink eachdrink : myDrinks) {
            String drinkDescription = eachdrink.toString();
            String output = drinkDescription;
            return Response.status(200).entity(output).build();
>>>>>>> 33d3ff1c72ec206f4ab5a50610484ba104d8d6e0
        }

        return null;

    }
}
