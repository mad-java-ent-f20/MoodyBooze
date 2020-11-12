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
        
    

    }
}
