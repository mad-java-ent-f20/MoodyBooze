package Controller;


import api.Recipes;
import entity.Drink;
import entity.DrinkName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.GenericDao;
import utilities.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet
        (urlPatterns = { "/findCocktailName" } )



public class FindCocktailName extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String param1 = req.getParameter("mood");
        String param2 = req.getParameter("season");

        GenericDao genericDao = new GenericDao(Drink.class);
        String cocktail =  genericDao.GetDrinkName(param1, param2);
        cocktail = cocktail.replaceAll("\\s", "%20");

        DrinkName drink1 = new DrinkName();
        drink1.setDrinkName(cocktail);
        System.out.println("FindCocktailName1 " + drink1.getDrinkName());

        resp.sendRedirect("http://localhost:8080/MoodyBooze_war/recipes");
    }

}