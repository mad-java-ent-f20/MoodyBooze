package persistence;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class CocktailDBDao {
    DrinksItem getResponse() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=11007");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);


        ObjectMapper mapper = new ObjectMapper();
        DrinksItem responseAPI = mapper.readValue(response, DrinksItem.class);
        return responseAPI;
    }
}
