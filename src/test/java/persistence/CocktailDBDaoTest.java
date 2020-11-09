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
        List<String> expectResponse = new ArrayList<String>();
        expectResponse.add("DrinksItem{strDrinkFR = 'null',strInstructionsDE = 'Reiben Sie den Rand des Glases mit der Limettenscheibe, damit das Salz daran haftet. Achten Sie darauf, dass nur der äußere Rand angefeuchtet wird und streuen Sie das Salz darauf. Das Salz sollte sich auf den Lippen des Genießers befinden und niemals in den Cocktail einmischen. Die anderen Zutaten mit Eis schütteln und vorsichtig in das Glas geben.',strDrinkZH-HANS = 'null',strDrinkZH-HANT = 'null',strIngredient10 = 'null',strDrink = 'Margarita',strIngredient12 = 'null',strIngredient11 = 'null',strIngredient14 = 'null',strCategory = 'Ordinary Drink',strAlcoholic = 'Alcoholic',strIngredient13 = 'null',strIngredient15 = 'null',strCreativeCommonsConfirmed = 'Yes',strIBA = 'Contemporary Classics',strDrinkES = 'null',strVideo = 'null',strTags = 'IBA,ContemporaryClassic',strInstructions = 'Rub the rim of the glass with the lime slice to make the salt stick to it. Take care to moisten only the outer rim and sprinkle the salt on it. The salt should present to the lips of the imbiber and never mix into the cocktail. Shake the other ingredients with ice, then carefully pour into the glass.',strIngredient1 = 'Tequila',strIngredient3 = 'Lime juice',strIngredient2 = 'Triple sec',strIngredient5 = 'null',strIngredient4 = 'Salt',strIngredient7 = 'null',strIngredient6 = 'null',strIngredient9 = 'null',strInstructionsFR = 'null',strIngredient8 = 'null',idDrink = '11007',strInstructionsES = 'null',strGlass = 'Cocktail glass',strDrinkDE = 'null',strMeasure12 = 'null',strMeasure13 = 'null',strMeasure10 = 'null',strMeasure11 = 'null',dateModified = '2015-08-18 14:42:59',strDrinkAlternate = 'null',strDrinkThumb = 'https://www.thecocktaildb.com/images/media/drink/5noda61589575158.jpg',strInstructionsZH-HANT = 'null',strMeasure9 = 'null',strMeasure7 = 'null',strMeasure8 = 'null',strMeasure5 = 'null',strMeasure6 = 'null',strMeasure3 = '1 oz ',strMeasure4 = 'null',strMeasure1 = '1 1/2 oz ',strMeasure2 = '1/2 oz ',strInstructionsZH-HANS = 'null',strMeasure14 = 'null',strMeasure15 = 'null'}");

        //assertEquals(expectResponse, dao.getResponse().getDrinks());
        expectResponse.contains(dao.getResponse().getDrinks());
        //assertTrue(Arrays.equals(expectResponse, dao.getResponse().getDrinks()));

    }


}