# Time Log

Week 1
* Caroline and Alisa reviewed deliverables and due dates to list out required tasks in the project plan
* Ying created a Maven project for the app
* Janak created an AWS instance for the project

Week 2
* Added User Stories
* Caroline used the random drink generator in the Cocktail DB to create some seed data for the database. Started to create database but having issues in Intellij not finding it. Planning to build the database on Friday, then give SQL to team so they can build local copies.
* Ying created on RestfulDao and start RestfulDaoTEst class(Still need to solve the test class to get the correct value from API instead of null with @Jsonignore)
* Caroline added .sql files to test/resources to create tables in moodybooze database and moodybooze_test. added content to cleandb.sql for refreshing the test database. I realized everyone will have to create and maintain their own database.properties file for connection to the test database because everyone's local password will be different.
* Janak create drink entity
* Ying create test for drink entity
* Alisa create test for cocktailDB
* Caroline updated the HelloWorld api code to refer to the drink entity instead of just returning text. Impelemnted the Generic Dao [incorrectly] and created a for-loop for returning info about multiple drinks.

Week 3
* Wednesday 11/11 Caroline, Ying, and Alisa worked in class to implement the Dao correctly and make sure the webservice was returning data. We discussed how to ensure we were really generating json, whether to return a formatted string that could be read like json or a java object that would be converted into a json object. We decided not to return a java object because we didn't want to store all the recipe data we were looking up from cocktailDB. At this time we felt the remaining work included updating the Recipes.java to return a formatted json-like string and accept 2 input parameters instead of just 1.
* Over the weekend Janak and Ying worked together on generating the correct output. An error was discovered where we realized we were not actually looking up drinks from the api (cocktailDB).
* Monday 11/16 the whole team met up to resolve issues with accessing the CocktailDB. We had been unsure how to pass the name retreived from the local database into the call to the cocktailDB. We realized we could pass in the name of the drink we wanted in our CoctailDBDao method and use that to build the API call URL. Ying and Alisa worked to clean up the code after all of the experimenting.
* Tuesday 11/17 Alisa created a landing page which allowed use to use a servlet to provide a UI for individuals to interact with the webservice instead of just developers. We decided to focus on this use case instead of returning structured json intended for the consumption of a developer/other application. Ying added error handling for HTTP Status 500 errors and validation of user input. 
* Wednesday 11/18 We realized we were not using the MoodApplication class and weren't sure why. We tested using different ApplicationPaths but they all seemed to break the app. We decided to leave it out for the time being and route everything directly to recipes.java. We updated recipes.java to declare that we were generating plaintext instead of json. We ran into confusion with pulling new code from Git. Alisa had to rebuild her database. Janak worked on deploying and ensuring everything functioned from amazon. Caroline created javadoc and cleaned up the git cache to stop tracking files listed in the .gitignore.
