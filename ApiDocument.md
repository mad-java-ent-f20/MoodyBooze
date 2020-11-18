# API Document

### Data Params

| Parameter | Description| Type/Format | Required/Optional|
|------|------|-------|------|
|Mood|Mood of user| String | Required
|Season| Current season for user |String|  Required | 


### GET
Returns a drink recipe

.. code-block:: bash

    GET http://localhost:8080/MoodyBooze_war/recipes/Celebratory/Spring

.. code-block:: bash

### Example Output
    Your drink: Champagne Cocktail
    
    Ingredients: 
    
    Champagne   Chilled 
    Sugar	    1 piece 
    Bitters	    2 dashes 
    Lemon peel  1 twist of 
    Cognac	    1 dash


### Error Response
* Status Code: 500

### Success Response
* Status Code: 200



             

