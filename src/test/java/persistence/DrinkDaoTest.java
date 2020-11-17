package persistence;

import entity.Drink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Database;

import java.util.List;
import static org.junit.Assert.*;

class DrinkDaoTest {

    GenericDao genericDao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Drink.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verify successful retrieval of all Drink
     */
    @Test
    void getAll() {
        List<Drink> drinks = genericDao.getAll();
        assertEquals(4, drinks.size());
    }

    /**
     * Verify successful retrieval of a Drink
     */
    @Test
    void getById() {
        Drink retrievedDrink = (Drink)genericDao.getById(62);
        assertNotNull(retrievedDrink);
        assertEquals("Amaretto Tea", retrievedDrink.getName());
    }

    /**
     * Verify successful insert of a Drink
     */
    @Test
    void insert() {
        Drink newDrink = new Drink("Magarita", "Energetic", "Summer");
        int id = genericDao.insert(newDrink);
        assertNotEquals(0,id);
        Drink insertedDrink = (Drink)genericDao.getById(id);
        String expectedDrink = "Magarita";
        String actualDrink = insertedDrink.getName();
        assertTrue(expectedDrink.equals(actualDrink));
    }

    /**
     * Verify successful delete of Drink
     */
    @Test
    void delete() {
        genericDao.delete(genericDao.getById(2));
        assertNull(genericDao.getById(2));
    }

    /**
     * Verify successful update of a Drink
     */
    @Test
    void saveOrUpdate() {
        String updateNewDrink = "Summer";
        Drink DrinkBeforeUpdate = (Drink)genericDao.getById(3);
        DrinkBeforeUpdate.setWeather(updateNewDrink);
        genericDao.saveOrUpdate(DrinkBeforeUpdate);
        Drink drinkAfterUpdate = (Drink)genericDao.getById(3);
        String expectedDrink = "Summer";
        String actualDrink = drinkAfterUpdate.getWeather();
        assertTrue(expectedDrink.equals(actualDrink));
    }


    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Drink> drinks = genericDao.getByPropertyEqual("mood", "Stressed");
        System.out.println(drinks);

        assertEquals(1, drinks.size());
        assertEquals(62, drinks.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Drink> drinks = genericDao.getByPropertyLike("name", "Ph");
        assertEquals(1, drinks.size());
    }

    /**
     * Verify successful Get Drink Name from database
     */
    @Test
    void GetDrinkNameSuccess() {
        String drinks =  genericDao.GetDrinkName("Stressed", "Fall");
        assertEquals("Amaretto Tea", drinks);
    }


}