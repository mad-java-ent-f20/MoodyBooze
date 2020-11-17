package persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


class CocktailDBDaoTest {

    @Test
    void getResponseSuccess() throws JsonProcessingException {
        CocktailDBDao dao = new CocktailDBDao();

        for (DrinksItem drink : dao.getResponseDrink("Champagne%20cocktail").getDrinks()){
            assertEquals("Champagne Cocktail", drink.getStrDrink());
        }
    }


}