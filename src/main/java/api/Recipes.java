package api;

import entity.Drink;
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
    public Response getMessageJason(@PathParam("param") String mood) {
        //This should be a call to a DAO that would have a method to getByMood
        GenericDao<Drink> genericDao = DaoFactory.createDao(Drink.class);
        //do so
        List<Drink> myDrinks = genericDao.getByPropertyEqual(mood, mood);

        //go through the list of drinks that match the mood & return them
        for (Drink eachdrink : myDrinks) {
            String drinkDescription = eachdrink.toString();
            String output = drinkDescription;
            return Response.status(200).entity(output).build();
        }

        return null;
    // The Java method will process HTTP GET requests
    //@GET
    //@Path("/{param}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    /* @Produces({"text/plain"})
    public Response getMessageText(@PathParam("param") String msg) {
        // Return a simple message
        String outputString = "Hello(text): "+ msg;
        return Response.status(200).entity(outputString).build();
    }
    */

    // The Java method will process HTTP GET requests
    //@GET
    //@Path("/{param}")
    // The Java method will produce content identified by the MIME Media type "text/html"
    /*@Produces({"text/html"})
    public Response getMessageHTML(@PathParam("param") String msg) {

        String outputHtml = "<html><body><h1>Hello(HTML): "+ msg + "</h1></body></html>";
        return Response.status(200).entity(outputHtml).build();
    }
    */

    }
}
