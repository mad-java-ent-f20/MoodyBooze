# MoodyBooze

This repository contains a webservice that helps people set the menu for a practical night in by providing drink recipes based on their mood and the current season

### Problem Statement

Since the beginning of the coronavirus pandemic, having a bartender fix you a fancy drink at a crowded bar is just a memory of a more carefree time. Drinking at home can be boring, and finding a high-quality drink recipe online that suits your current mood and the season is tedious. Many drink recipes often call for just a few drops of certain specialty liquors, requiring a trip to the store for one item--that just isn't practical during a pandemic.


### Project Objectives 

For people who want to add some festivity to their night in, and perhaps use up the remaining Kahlua from New Years' Eve 2019, the MoodyBooze webservice looks up drink recipes. Input options include:
* mood
* season

For example, someone who is feeling ambitious on a dark winter morning might be interested in a mulled wine to help them draft a few thousand words of their novel. The MoodyBooze web service will find them a recipe.

For developers, MoodyBooze can be combined with other webservices to provide a complete planning service for an absolutely tolerable 274th night on the couch. Help people stave off boredom with activity and game suggestions!  

### Resources
* [API Documentation](ApiDocument.md)

### Service Calls
* GET http://localhost:8080/MoodyBooze_war/recipes/{Mood}/{Season}

### Design 

* [User Stories](UserStories.md)
* [Drink Data](Drinkdata.txt)
* [List of Moods](ListOfMoods)


### [Project Plan](ProjectPlan.md)
* [Time](timeLog.md)
