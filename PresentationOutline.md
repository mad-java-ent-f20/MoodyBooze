Presentation: topics to cover

1. MoodyBooze API purpose

The webservice we made provides the ingredients for a cocktail based on input parameters of mood and weather.

For example, say that it's a cold snowy day but you're feeling ambitious.
The MoodyBooze API will suggest that you mix up a Victor, which is an intense gin and brandy cocktail.

Developers can use this webservice to help assemble a more complete application that might help people plan a night in., by combining our drink recommendations with suggestions for activities or food menus.

This type of webservice might be sepecially useful during the Pandemic when it's best not to go out, but people are getting bored staying at home.

2. How MoodyBooze API works

The MoodyBooze webservice uses its own database which stores a list of about 20 different moods ranging from cranky and crushed to energetic and excited. For each of these, there are four possible seasons--winter, spring, summer, and fall--and an associated drink suggestion for the combination.

Our databse doesn't store the drink recipes themselves. To get the details of the ingredients, we consume a different webservice, called the cocktailDB, which returns a JSON object listing drink ingredients and measurements and allows us to search the database by name.

3. Our webservice soure code - go through Recipes.java

Our web service is located under the recipes path and takes two input parameters.
It uses a DAO to access the Drink entity, and look up a single drink that matches the mood and season that the user provided.
We use an additional DAO to access the cocktail database webservice and find out the ingredients for the selected drink.
We are returning a structure string instead of storing the retrieved information on a java object.

Changing this to a real java object would provide developers a more structured expected output, but would require more data from the Coctail Database to be stored, instead of simply taking advantage of the opportunity to look it up each time we make a call.

4. Calling the CocktailDB - go through COcktailDBDao
We use the CocktailDBDao class to consume the CocktailDB web service.
We pass the name of the drink that we retrieved from the database into this getResponseDrink method.
The ResponseDrink object that it returns is a collection of DrinksItem objects that match the search input we provided.
With our use of the API, we hope to just get one thing back.
Each DrinksItem object has several instance variables that describe how to prepare the drink, what type of glass to put it in, and the amount of each ingredient to use. It even provides the info in different languages.
We are using just a few of these in the string we pass back.

Go to Recipes.java
We cast the ingredient information as strings because again we wanted to avoid storing them on a java object.

5. Do a demo of the application in a browser

