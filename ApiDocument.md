# API Document

### Data Params

| Parameter | Description| Type/Format | Required/Optional|
|------|------|-------|------|
|Mood|The mood of user| String | Required
|Season| Current season for user |String|  Required | 


### Service Call
GET:
Returns a drink recipe

    GET http://localhost:8080/MoodyBooze_war/recipes/{Mood}/{Season}


    GET http://localhost:8080/MoodyBooze_war/recipes/Celebratory/Spring



### Example Output
    Your drink: Champagne Cocktail
    
    Ingredients: 
    
    Champagne   Chilled 
    Sugar     1 piece 
    Bitters     2 dashes 
    Lemon peel  1 twist of 
    Cognac     1 dash


### Error Response
* Status Code: 500
    * Content:


    Invalid Parameter Input



### Success Response
* Status Code: 200
     * Content:
 
 
     *Refer to Example Output
     

### Resource
* https://www.thecocktaildb.com/api.php
