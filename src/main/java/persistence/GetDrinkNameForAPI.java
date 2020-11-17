package persistence;


import Controller.FindCocktailName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.*;
import entity.DrinkName;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Collections;

public class GetDrinkNameForAPI {

    public ResponseDrink getResponseDrinkFromAPI() throws JsonProcessingException {

        //getDrinkName();

//        System.out.println("drink1.getDrinkName() Super " + getDrinkName());
        Client client = ClientBuilder.newClient();

        DrinkName drink1 = new DrinkName();
        System.out.println("drink1.getDrinkName() Before " + drink1.getDrinkName());

        String cocktail = "California Lemonade";
        cocktail = cocktail.replaceAll("\\s", "%20");
        drink1.setDrinkName(cocktail);

        System.out.println("drink1.getDrinkName() After " + drink1.getDrinkName());

        WebTarget target = client.target("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + drink1.getDrinkName());
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
