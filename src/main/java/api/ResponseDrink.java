package api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown=true)
public class ResponseDrink {

	@JsonProperty("drinks")
	private List<DrinksItem> drinks;

	public void setDrinks(List<DrinksItem> drinks){
		this.drinks = drinks;
	}

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