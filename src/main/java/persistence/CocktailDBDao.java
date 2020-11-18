package persistence;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * The type Cocktail db dao.
 */
public class CocktailDBDao {
    /**
     * Gets response drink, a collection of DrinksItem objects, from the cocktailDB.
     *
     * @param nameDrink the name drink
     * @return the response drink
     * @throws JsonProcessingException the json processing exception
     */
    public ResponseDrink getResponseDrink(String nameDrink) throws JsonProcessingException {

        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + nameDrink);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        ResponseDrink responseAPI = null;
        try {
            responseAPI = mapper.readValue(response, ResponseDrink.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return responseAPI;
    }
}
