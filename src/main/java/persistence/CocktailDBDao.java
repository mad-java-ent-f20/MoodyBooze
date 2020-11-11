package persistence;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class CocktailDBDao {
    ResponseDrink getResponseDrink() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=11007");
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