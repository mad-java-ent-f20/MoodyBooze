package persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import api.*;

import static org.junit.Assert.assertEquals;

class CocktailDBDaoTest {

    @Test
    void getResponseSuccess() throws JsonProcessingException {
        CocktailDBDao dao = new CocktailDBDao();

        String expectResponse = "Margarita"; // Margarita
        assertEquals(expectResponse, dao.getResponse().getStrDrink());


    }
}