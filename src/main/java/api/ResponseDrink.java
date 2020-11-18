package api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Response drink. The collection of DrinksItem objects returned by the CocktailDB service.
 */
//@JsonIgnoreProperties(ignoreUnknown=true)
public class ResponseDrink {

	@JsonProperty("drinks")
	private List<DrinksItem> drinks;

	/**
	 * Set drinks. Not used in this application because we are not attempting to add data to the CocktailDB.
	 *
	 * @param drinks the drinks
	 */
	public void setDrinks(List<DrinksItem> drinks){
		this.drinks = drinks;
	}

	/**
	 * Get drinks list.
	 *
	 * @return the list of drinks matching the search/parameters.
	 */
	public List<DrinksItem> getDrinks(){
		return drinks;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"drinks = '" + drinks + '\'' + 
			"}";
		}
}