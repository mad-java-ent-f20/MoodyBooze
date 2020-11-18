package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Drinks item. This is the individual entity returned by the CocktailDB
 */
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DrinksItem{



	@JsonProperty("strDrinkFR")
	private Object strDrinkFR;

	@JsonProperty("strInstructionsDE")
	private String strInstructionsDE;

	@JsonProperty("strDrinkZH-HANS")
	private Object strDrinkZHHANS;

	@JsonProperty("strDrinkZH-HANT")
	private Object strDrinkZHHANT;

	@JsonProperty("strIngredient10")
	private Object strIngredient10;

	@JsonProperty("strDrink")
	private String strDrink;

	@JsonProperty("strIngredient12")
	private Object strIngredient12;

	@JsonProperty("strIngredient11")
	private Object strIngredient11;

	@JsonProperty("strIngredient14")
	private Object strIngredient14;

	@JsonProperty("strCategory")
	private String strCategory;

	@JsonProperty("strAlcoholic")
	private String strAlcoholic;

	@JsonProperty("strIngredient13")
	private Object strIngredient13;

	@JsonProperty("strIngredient15")
	private Object strIngredient15;

	@JsonProperty("strCreativeCommonsConfirmed")
	private String strCreativeCommonsConfirmed;

	@JsonProperty("strIBA")
	private String strIBA;

	@JsonProperty("strDrinkES")
	private Object strDrinkES;

	@JsonProperty("strVideo")
	private Object strVideo;

	@JsonProperty("strTags")
	private String strTags;

	@JsonProperty("strInstructions")
	private String strInstructions;

	@JsonProperty("strIngredient1")
	private String strIngredient1;

	@JsonProperty("strIngredient3")
	private String strIngredient3;

	@JsonProperty("strIngredient2")
	private String strIngredient2;

	@JsonProperty("strIngredient5")
	private Object strIngredient5;

	@JsonProperty("strIngredient4")
	private String strIngredient4;

	@JsonProperty("strIngredient7")
	private Object strIngredient7;

	@JsonProperty("strIngredient6")
	private Object strIngredient6;

	@JsonProperty("strIngredient9")
	private Object strIngredient9;

	@JsonProperty("strInstructionsFR")
	private Object strInstructionsFR;

	@JsonProperty("strIngredient8")
	private Object strIngredient8;

	@JsonProperty("idDrink")
	private String idDrink;

	@JsonProperty("strInstructionsES")
	private Object strInstructionsES;

	@JsonProperty("strGlass")
	private String strGlass;

	@JsonProperty("strDrinkDE")
	private Object strDrinkDE;

	@JsonProperty("strMeasure12")
	private Object strMeasure12;

	@JsonProperty("strMeasure13")
	private Object strMeasure13;

	@JsonProperty("strMeasure10")
	private Object strMeasure10;

	@JsonProperty("strMeasure11")
	private Object strMeasure11;

	@JsonProperty("dateModified")
	private String dateModified;

	@JsonProperty("strDrinkAlternate")
	private Object strDrinkAlternate;

	@JsonProperty("strDrinkThumb")
	private String strDrinkThumb;

	@JsonProperty("strInstructionsZH-HANT")
	private Object strInstructionsZHHANT;

	@JsonProperty("strMeasure9")
	private Object strMeasure9;

	@JsonProperty("strMeasure7")
	private Object strMeasure7;

	@JsonProperty("strMeasure8")
	private Object strMeasure8;

	@JsonProperty("strMeasure5")
	private Object strMeasure5;

	@JsonProperty("strMeasure6")
	private Object strMeasure6;

	@JsonProperty("strMeasure3")
	private String strMeasure3;

	@JsonProperty("strMeasure4")
	private Object strMeasure4;

	@JsonProperty("strMeasure1")
	private String strMeasure1;

	@JsonProperty("strMeasure2")
	private String strMeasure2;

	@JsonProperty("strInstructionsZH-HANS")
	private Object strInstructionsZHHANS;

	@JsonProperty("strMeasure14")
	private Object strMeasure14;

	@JsonProperty("strMeasure15")
	private Object strMeasure15;

	/**
	 * Set str drink fr.
	 *
	 * @param strDrinkFR the str drink fr
	 */
	public void setStrDrinkFR(Object strDrinkFR){
		this.strDrinkFR = strDrinkFR;
	}

	/**
	 * Get str drink fr object.
	 *
	 * @return the object
	 */
	public Object getStrDrinkFR(){
		return strDrinkFR;
	}

	/**
	 * Set str instructions de.
	 *
	 * @param strInstructionsDE the str instructions de
	 */
	public void setStrInstructionsDE(String strInstructionsDE){
		this.strInstructionsDE = strInstructionsDE;
	}

	/**
	 * Get str instructions de string.
	 *
	 * @return the string
	 */
	public String getStrInstructionsDE(){
		return strInstructionsDE;
	}

	/**
	 * Set str drink zhhans.
	 *
	 * @param strDrinkZHHANS the str drink zhhans
	 */
	public void setStrDrinkZHHANS(Object strDrinkZHHANS){
		this.strDrinkZHHANS = strDrinkZHHANS;
	}

	/**
	 * Get str drink zhhans object.
	 *
	 * @return the object
	 */
	public Object getStrDrinkZHHANS(){
		return strDrinkZHHANS;
	}

	/**
	 * Set str drink zhhant.
	 *
	 * @param strDrinkZHHANT the str drink zhhant
	 */
	public void setStrDrinkZHHANT(Object strDrinkZHHANT){
		this.strDrinkZHHANT = strDrinkZHHANT;
	}

	/**
	 * Get str drink zhhant object.
	 *
	 * @return the object
	 */
	public Object getStrDrinkZHHANT(){
		return strDrinkZHHANT;
	}

	/**
	 * Set str ingredient 10.
	 *
	 * @param strIngredient10 the str ingredient 10
	 */
	public void setStrIngredient10(Object strIngredient10){
		this.strIngredient10 = strIngredient10;
	}

	/**
	 * Get str ingredient 10 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient10(){
		return strIngredient10;
	}

	/**
	 * Set str drink.
	 *
	 * @param strDrink the str drink
	 */
	public void setStrDrink(String strDrink){
		this.strDrink = strDrink;
	}

	/**
	 * Get str drink string.
	 *
	 * @return the string
	 */
	public String getStrDrink(){
		return strDrink;
	}

	/**
	 * Set str ingredient 12.
	 *
	 * @param strIngredient12 the str ingredient 12
	 */
	public void setStrIngredient12(Object strIngredient12){
		this.strIngredient12 = strIngredient12;
	}

	/**
	 * Get str ingredient 12 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient12(){
		return strIngredient12;
	}

	/**
	 * Set str ingredient 11.
	 *
	 * @param strIngredient11 the str ingredient 11
	 */
	public void setStrIngredient11(Object strIngredient11){
		this.strIngredient11 = strIngredient11;
	}

	/**
	 * Get str ingredient 11 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient11(){
		return strIngredient11;
	}

	/**
	 * Set str ingredient 14.
	 *
	 * @param strIngredient14 the str ingredient 14
	 */
	public void setStrIngredient14(Object strIngredient14){
		this.strIngredient14 = strIngredient14;
	}

	/**
	 * Get str ingredient 14 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient14(){
		return strIngredient14;
	}

	/**
	 * Set str category.
	 *
	 * @param strCategory the str category
	 */
	public void setStrCategory(String strCategory){
		this.strCategory = strCategory;
	}

	/**
	 * Get str category string.
	 *
	 * @return the string
	 */
	public String getStrCategory(){
		return strCategory;
	}

	/**
	 * Set str alcoholic.
	 *
	 * @param strAlcoholic the str alcoholic
	 */
	public void setStrAlcoholic(String strAlcoholic){
		this.strAlcoholic = strAlcoholic;
	}

	/**
	 * Get str alcoholic string.
	 *
	 * @return the string
	 */
	public String getStrAlcoholic(){
		return strAlcoholic;
	}

	/**
	 * Set str ingredient 13.
	 *
	 * @param strIngredient13 the str ingredient 13
	 */
	public void setStrIngredient13(Object strIngredient13){
		this.strIngredient13 = strIngredient13;
	}

	/**
	 * Get str ingredient 13 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient13(){
		return strIngredient13;
	}

	/**
	 * Set str ingredient 15.
	 *
	 * @param strIngredient15 the str ingredient 15
	 */
	public void setStrIngredient15(Object strIngredient15){
		this.strIngredient15 = strIngredient15;
	}

	/**
	 * Get str ingredient 15 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient15(){
		return strIngredient15;
	}

	/**
	 * Set str creative commons confirmed.
	 *
	 * @param strCreativeCommonsConfirmed the str creative commons confirmed
	 */
	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed){
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}

	/**
	 * Get str creative commons confirmed string.
	 *
	 * @return the string
	 */
	public String getStrCreativeCommonsConfirmed(){
		return strCreativeCommonsConfirmed;
	}

	/**
	 * Set str iba.
	 *
	 * @param strIBA the str iba
	 */
	public void setStrIBA(String strIBA){
		this.strIBA = strIBA;
	}

	/**
	 * Get str iba string.
	 *
	 * @return the string
	 */
	public String getStrIBA(){
		return strIBA;
	}

	/**
	 * Set str drink es.
	 *
	 * @param strDrinkES the str drink es
	 */
	public void setStrDrinkES(Object strDrinkES){
		this.strDrinkES = strDrinkES;
	}

	/**
	 * Get str drink es object.
	 *
	 * @return the object
	 */
	public Object getStrDrinkES(){
		return strDrinkES;
	}

	/**
	 * Set str video.
	 *
	 * @param strVideo the str video
	 */
	public void setStrVideo(Object strVideo){
		this.strVideo = strVideo;
	}

	/**
	 * Get str video object.
	 *
	 * @return the object
	 */
	public Object getStrVideo(){
		return strVideo;
	}

	/**
	 * Set str tags.
	 *
	 * @param strTags the str tags
	 */
	public void setStrTags(String strTags){
		this.strTags = strTags;
	}

	/**
	 * Get str tags string.
	 *
	 * @return the string
	 */
	public String getStrTags(){
		return strTags;
	}

	/**
	 * Set str instructions.
	 *
	 * @param strInstructions the str instructions
	 */
	public void setStrInstructions(String strInstructions){
		this.strInstructions = strInstructions;
	}

	/**
	 * Get str instructions string.
	 *
	 * @return the string
	 */
	public String getStrInstructions(){
		return strInstructions;
	}

	/**
	 * Set str ingredient 1.
	 *
	 * @param strIngredient1 the str ingredient 1
	 */
	public void setStrIngredient1(String strIngredient1){
		this.strIngredient1 = strIngredient1;
	}

	/**
	 * Get str ingredient 1 string.
	 *
	 * @return the string
	 */
	public String getStrIngredient1(){
		return strIngredient1;
	}

	/**
	 * Set str ingredient 3.
	 *
	 * @param strIngredient3 the str ingredient 3
	 */
	public void setStrIngredient3(String strIngredient3){
		this.strIngredient3 = strIngredient3;
	}

	/**
	 * Get str ingredient 3 string.
	 *
	 * @return the string
	 */
	public String getStrIngredient3(){
		return strIngredient3;
	}

	/**
	 * Set str ingredient 2.
	 *
	 * @param strIngredient2 the str ingredient 2
	 */
	public void setStrIngredient2(String strIngredient2){
		this.strIngredient2 = strIngredient2;
	}

	/**
	 * Get str ingredient 2 string.
	 *
	 * @return the string
	 */
	public String getStrIngredient2(){
		return strIngredient2;
	}

	/**
	 * Set str ingredient 5.
	 *
	 * @param strIngredient5 the str ingredient 5
	 */
	public void setStrIngredient5(Object strIngredient5){
		this.strIngredient5 = strIngredient5;
	}

	/**
	 * Get str ingredient 5 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient5(){
		return strIngredient5;
	}

	/**
	 * Set str ingredient 4.
	 *
	 * @param strIngredient4 the str ingredient 4
	 */
	public void setStrIngredient4(String strIngredient4){
		this.strIngredient4 = strIngredient4;
	}

	/**
	 * Get str ingredient 4 string.
	 *
	 * @return the string
	 */
	public String getStrIngredient4(){
		return strIngredient4;
	}

	/**
	 * Set str ingredient 7.
	 *
	 * @param strIngredient7 the str ingredient 7
	 */
	public void setStrIngredient7(Object strIngredient7){
		this.strIngredient7 = strIngredient7;
	}

	/**
	 * Get str ingredient 7 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient7(){
		return strIngredient7;
	}

	/**
	 * Set str ingredient 6.
	 *
	 * @param strIngredient6 the str ingredient 6
	 */
	public void setStrIngredient6(Object strIngredient6){
		this.strIngredient6 = strIngredient6;
	}

	/**
	 * Get str ingredient 6 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient6(){
		return strIngredient6;
	}

	/**
	 * Set str ingredient 9.
	 *
	 * @param strIngredient9 the str ingredient 9
	 */
	public void setStrIngredient9(Object strIngredient9){
		this.strIngredient9 = strIngredient9;
	}

	/**
	 * Get str ingredient 9 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient9(){
		return strIngredient9;
	}

	/**
	 * Set str instructions fr.
	 *
	 * @param strInstructionsFR the str instructions fr
	 */
	public void setStrInstructionsFR(Object strInstructionsFR){
		this.strInstructionsFR = strInstructionsFR;
	}

	/**
	 * Get str instructions fr object.
	 *
	 * @return the object
	 */
	public Object getStrInstructionsFR(){
		return strInstructionsFR;
	}

	/**
	 * Set str ingredient 8.
	 *
	 * @param strIngredient8 the str ingredient 8
	 */
	public void setStrIngredient8(Object strIngredient8){
		this.strIngredient8 = strIngredient8;
	}

	/**
	 * Get str ingredient 8 object.
	 *
	 * @return the object
	 */
	public Object getStrIngredient8(){
		return strIngredient8;
	}

	/**
	 * Set id drink.
	 *
	 * @param idDrink the id drink
	 */
	public void setIdDrink(String idDrink){
		this.idDrink = idDrink;
	}

	/**
	 * Get id drink string.
	 *
	 * @return the string
	 */
	public String getIdDrink(){
		return idDrink;
	}

	/**
	 * Set str instructions es.
	 *
	 * @param strInstructionsES the str instructions es
	 */
	public void setStrInstructionsES(Object strInstructionsES){
		this.strInstructionsES = strInstructionsES;
	}

	/**
	 * Get str instructions es object.
	 *
	 * @return the object
	 */
	public Object getStrInstructionsES(){
		return strInstructionsES;
	}

	/**
	 * Set str glass.
	 *
	 * @param strGlass the str glass
	 */
	public void setStrGlass(String strGlass){
		this.strGlass = strGlass;
	}

	/**
	 * Get str glass string.
	 *
	 * @return the string
	 */
	public String getStrGlass(){
		return strGlass;
	}

	/**
	 * Set str drink de.
	 *
	 * @param strDrinkDE the str drink de
	 */
	public void setStrDrinkDE(Object strDrinkDE){
		this.strDrinkDE = strDrinkDE;
	}

	/**
	 * Get str drink de object.
	 *
	 * @return the object
	 */
	public Object getStrDrinkDE(){
		return strDrinkDE;
	}

	/**
	 * Set str measure 12.
	 *
	 * @param strMeasure12 the str measure 12
	 */
	public void setStrMeasure12(Object strMeasure12){
		this.strMeasure12 = strMeasure12;
	}

	/**
	 * Get str measure 12 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure12(){
		return strMeasure12;
	}

	/**
	 * Set str measure 13.
	 *
	 * @param strMeasure13 the str measure 13
	 */
	public void setStrMeasure13(Object strMeasure13){
		this.strMeasure13 = strMeasure13;
	}

	/**
	 * Get str measure 13 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure13(){
		return strMeasure13;
	}

	/**
	 * Set str measure 10.
	 *
	 * @param strMeasure10 the str measure 10
	 */
	public void setStrMeasure10(Object strMeasure10){
		this.strMeasure10 = strMeasure10;
	}

	/**
	 * Get str measure 10 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure10(){
		return strMeasure10;
	}

	/**
	 * Set str measure 11.
	 *
	 * @param strMeasure11 the str measure 11
	 */
	public void setStrMeasure11(Object strMeasure11){
		this.strMeasure11 = strMeasure11;
	}

	/**
	 * Get str measure 11 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure11(){
		return strMeasure11;
	}

	/**
	 * Set date modified.
	 *
	 * @param dateModified the date modified
	 */
	public void setDateModified(String dateModified){
		this.dateModified = dateModified;
	}

	/**
	 * Get date modified string.
	 *
	 * @return the string
	 */
	public String getDateModified(){
		return dateModified;
	}

	/**
	 * Set str drink alternate.
	 *
	 * @param strDrinkAlternate the str drink alternate
	 */
	public void setStrDrinkAlternate(Object strDrinkAlternate){
		this.strDrinkAlternate = strDrinkAlternate;
	}

	/**
	 * Get str drink alternate object.
	 *
	 * @return the object
	 */
	public Object getStrDrinkAlternate(){
		return strDrinkAlternate;
	}

	/**
	 * Set str drink thumb.
	 *
	 * @param strDrinkThumb the str drink thumb
	 */
	public void setStrDrinkThumb(String strDrinkThumb){
		this.strDrinkThumb = strDrinkThumb;
	}

	/**
	 * Get str drink thumb string.
	 *
	 * @return the string
	 */
	public String getStrDrinkThumb(){
		return strDrinkThumb;
	}

	/**
	 * Set str instructions zhhant.
	 *
	 * @param strInstructionsZHHANT the str instructions zhhant
	 */
	public void setStrInstructionsZHHANT(Object strInstructionsZHHANT){
		this.strInstructionsZHHANT = strInstructionsZHHANT;
	}

	/**
	 * Get str instructions zhhant object.
	 *
	 * @return the object
	 */
	public Object getStrInstructionsZHHANT(){
		return strInstructionsZHHANT;
	}

	/**
	 * Set str measure 9.
	 *
	 * @param strMeasure9 the str measure 9
	 */
	public void setStrMeasure9(Object strMeasure9){
		this.strMeasure9 = strMeasure9;
	}

	/**
	 * Get str measure 9 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure9(){
		return strMeasure9;
	}

	/**
	 * Set str measure 7.
	 *
	 * @param strMeasure7 the str measure 7
	 */
	public void setStrMeasure7(Object strMeasure7){
		this.strMeasure7 = strMeasure7;
	}

	/**
	 * Get str measure 7 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure7(){
		return strMeasure7;
	}

	/**
	 * Set str measure 8.
	 *
	 * @param strMeasure8 the str measure 8
	 */
	public void setStrMeasure8(Object strMeasure8){
		this.strMeasure8 = strMeasure8;
	}

	/**
	 * Get str measure 8 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure8(){
		return strMeasure8;
	}

	/**
	 * Set str measure 5.
	 *
	 * @param strMeasure5 the str measure 5
	 */
	public void setStrMeasure5(Object strMeasure5){
		this.strMeasure5 = strMeasure5;
	}

	/**
	 * Get str measure 5 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure5(){
		return strMeasure5;
	}

	/**
	 * Set str measure 6.
	 *
	 * @param strMeasure6 the str measure 6
	 */
	public void setStrMeasure6(Object strMeasure6){
		this.strMeasure6 = strMeasure6;
	}

	/**
	 * Get str measure 6 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure6(){
		return strMeasure6;
	}

	/**
	 * Set str measure 3.
	 *
	 * @param strMeasure3 the str measure 3
	 */
	public void setStrMeasure3(String strMeasure3){
		this.strMeasure3 = strMeasure3;
	}

	/**
	 * Get str measure 3 string.
	 *
	 * @return the string
	 */
	public String getStrMeasure3(){
		return strMeasure3;
	}

	/**
	 * Set str measure 4.
	 *
	 * @param strMeasure4 the str measure 4
	 */
	public void setStrMeasure4(Object strMeasure4){
		this.strMeasure4 = strMeasure4;
	}

	/**
	 * Get str measure 4 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure4(){
		return strMeasure4;
	}

	/**
	 * Set str measure 1.
	 *
	 * @param strMeasure1 the str measure 1
	 */
	public void setStrMeasure1(String strMeasure1){
		this.strMeasure1 = strMeasure1;
	}

	/**
	 * Get str measure 1 string.
	 *
	 * @return the string
	 */
	public String getStrMeasure1(){
		return strMeasure1;
	}

	/**
	 * Set str measure 2.
	 *
	 * @param strMeasure2 the str measure 2
	 */
	public void setStrMeasure2(String strMeasure2){
		this.strMeasure2 = strMeasure2;
	}

	/**
	 * Get str measure 2 string.
	 *
	 * @return the string
	 */
	public String getStrMeasure2(){
		return strMeasure2;
	}

	/**
	 * Set str instructions zhhans.
	 *
	 * @param strInstructionsZHHANS the str instructions zhhans
	 */
	public void setStrInstructionsZHHANS(Object strInstructionsZHHANS){
		this.strInstructionsZHHANS = strInstructionsZHHANS;
	}

	/**
	 * Get str instructions zhhans object.
	 *
	 * @return the object
	 */
	public Object getStrInstructionsZHHANS(){
		return strInstructionsZHHANS;
	}

	/**
	 * Set str measure 14.
	 *
	 * @param strMeasure14 the str measure 14
	 */
	public void setStrMeasure14(Object strMeasure14){
		this.strMeasure14 = strMeasure14;
	}

	/**
	 * Get str measure 14 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure14(){
		return strMeasure14;
	}

	/**
	 * Set str measure 15.
	 *
	 * @param strMeasure15 the str measure 15
	 */
	public void setStrMeasure15(Object strMeasure15){
		this.strMeasure15 = strMeasure15;
	}

	/**
	 * Get str measure 15 object.
	 *
	 * @return the object
	 */
	public Object getStrMeasure15(){
		return strMeasure15;
	}

	@Override
 	public String toString(){
		return 
			"DrinksItem{" + 
			"strDrinkFR = '" + strDrinkFR + '\'' + 
			",strInstructionsDE = '" + strInstructionsDE + '\'' + 
			",strDrinkZH-HANS = '" + strDrinkZHHANS + '\'' + 
			",strDrinkZH-HANT = '" + strDrinkZHHANT + '\'' + 
			",strIngredient10 = '" + strIngredient10 + '\'' + 
			",strDrink = '" + strDrink + '\'' + 
			",strIngredient12 = '" + strIngredient12 + '\'' + 
			",strIngredient11 = '" + strIngredient11 + '\'' + 
			",strIngredient14 = '" + strIngredient14 + '\'' + 
			",strCategory = '" + strCategory + '\'' + 
			",strAlcoholic = '" + strAlcoholic + '\'' + 
			",strIngredient13 = '" + strIngredient13 + '\'' + 
			",strIngredient15 = '" + strIngredient15 + '\'' + 
			",strCreativeCommonsConfirmed = '" + strCreativeCommonsConfirmed + '\'' + 
			",strIBA = '" + strIBA + '\'' + 
			",strDrinkES = '" + strDrinkES + '\'' + 
			",strVideo = '" + strVideo + '\'' + 
			",strTags = '" + strTags + '\'' + 
			",strInstructions = '" + strInstructions + '\'' + 
			",strIngredient1 = '" + strIngredient1 + '\'' + 
			",strIngredient3 = '" + strIngredient3 + '\'' + 
			",strIngredient2 = '" + strIngredient2 + '\'' + 
			",strIngredient5 = '" + strIngredient5 + '\'' + 
			",strIngredient4 = '" + strIngredient4 + '\'' + 
			",strIngredient7 = '" + strIngredient7 + '\'' + 
			",strIngredient6 = '" + strIngredient6 + '\'' + 
			",strIngredient9 = '" + strIngredient9 + '\'' + 
			",strInstructionsFR = '" + strInstructionsFR + '\'' + 
			",strIngredient8 = '" + strIngredient8 + '\'' + 
			",idDrink = '" + idDrink + '\'' + 
			",strInstructionsES = '" + strInstructionsES + '\'' + 
			",strGlass = '" + strGlass + '\'' + 
			",strDrinkDE = '" + strDrinkDE + '\'' + 
			",strMeasure12 = '" + strMeasure12 + '\'' + 
			",strMeasure13 = '" + strMeasure13 + '\'' + 
			",strMeasure10 = '" + strMeasure10 + '\'' + 
			",strMeasure11 = '" + strMeasure11 + '\'' + 
			",dateModified = '" + dateModified + '\'' + 
			",strDrinkAlternate = '" + strDrinkAlternate + '\'' + 
			",strDrinkThumb = '" + strDrinkThumb + '\'' + 
			",strInstructionsZH-HANT = '" + strInstructionsZHHANT + '\'' + 
			",strMeasure9 = '" + strMeasure9 + '\'' + 
			",strMeasure7 = '" + strMeasure7 + '\'' + 
			",strMeasure8 = '" + strMeasure8 + '\'' + 
			",strMeasure5 = '" + strMeasure5 + '\'' + 
			",strMeasure6 = '" + strMeasure6 + '\'' + 
			",strMeasure3 = '" + strMeasure3 + '\'' + 
			",strMeasure4 = '" + strMeasure4 + '\'' + 
			",strMeasure1 = '" + strMeasure1 + '\'' + 
			",strMeasure2 = '" + strMeasure2 + '\'' + 
			",strInstructionsZH-HANS = '" + strInstructionsZHHANS + '\'' + 
			",strMeasure14 = '" + strMeasure14 + '\'' + 
			",strMeasure15 = '" + strMeasure15 + '\'' + 
			"}";
		}
}