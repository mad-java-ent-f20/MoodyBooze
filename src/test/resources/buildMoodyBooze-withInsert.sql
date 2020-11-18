-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: moodybooze
-- ------------------------------------------------------
-- Server version	8.0.22-0ubuntu0.20.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `drink`
--
CREATE DATABASE moodybooze;
  USE moodybooze;
DROP TABLE IF EXISTS `drink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drink` (
  `id` int NOT NULL AUTO_INCREMENT,
  `drink_name` varchar(30) DEFAULT NULL,
  `drink_mood` varchar(20) DEFAULT NULL,
  `drink_season` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drink`
--

LOCK TABLES `drink` WRITE;
/*!40000 ALTER TABLE `drink` DISABLE KEYS */;
INSERT INTO `drink` (`id`, `drink_name`, `drink_mood`, `drink_season`) VALUES (
1,'Champagne cocktail','Celebratory','Spring'),(
2,'California Lemonade','Crushed','Spring'),(
3,'Lemon Drop','Blissful','Spring'),(
4,'English Rose Cocktail','Calm','Spring'),(
5,'Zorro','Stressed','Spring'),(
6,'French Connection','Excited','Spring'),(
7,'Blueberry mojito','Energetic','Spring'),(
8,'Kamikaze','Flirty','Spring'),(
9,'Masala Chai','Drained','Spring'),(
10,'Stone Sour','Disappointed','Spring'),(
11,'After Dinner Cocktail','Gloomy','Spring'),(
12,'Masala Chai','Anxious','Spring'),(
13,'Godfather','Grumpy','Spring'),(
14,'The Strange Weaver','Peaceful','Spring'),(
15,'Boxcar','Cranky','Spring'),(
16,'Gin Sour','Ambitious','Spring'),(
17,'English Highball','Relieved','Spring'),(
18,'Bobby Burns Cocktail','Hopeful','Spring'),(
19,'Mimosa','Festive','Spring'),(
20,'Bees Knees','Celebratory','Summer'),(
21,'Orange Crush','Crushed','Summer'),(
22,'Daiquiri','Blissful','Summer'),(
23,'Caipirinha','Calm','Summer'),(
24,'Quarter Deck Cocktail','Stressed','Summer'),(
25,'Blue Hurricane','Excited','Summer'),(
26,'Blueberry mojito','Energetic','Summer'),(
27,'Gin Daisy','Flirty','Summer'),(
28,'Rum Runner','Drained','Summer'),(
29,'Grand Blue','Disappointed','Summer'),(
30,'Tequila Sunrise','Gloomy','Summer'),(
31,'Hemingway Special','Anxious','Summer'),(
32,'Alabama Slammer','Grumpy','Summer'),(
33,'Dragonfly','Peaceful','Summer'),(
34,'Strawberry Shivers','Cranky','Summer'),(
35,'Gin Swizzle','Ambitious','Summer'),(
36,'Victory Collins','Relieved','Summer'),(
37,'Smashed Watermelon Margarita','Hopeful','Summer'),(
38,'Bora Bora','Festive','Summer'),(
39,'Bellini','Celebratory','Winter'),(
40,'Arizona Antifreeze','Crushed','Winter'),(
41,'Tom Collins','Blissful','Winter'),(
42,'Honey Bee','Calm','Winter'),(
43,'Brandy Alexander','Stressed','Winter'),(
44,'Greyhound','Excited','Winter'),(
45,'Salty Dog','Energetic','Winter'),(
46,'Negroni','Flirty','Winter'),(
47,'After Five','Drained','Winter'),(
48,'Veteran','Disappointed','Winter'),(
49,'A Furlong Too Late','Gloomy','Winter'),(
50,'The Philosopher','Anxious','Winter'),(
51,'A Day at the Beach','Grumpy','Winter'),(
52,'Orange Scented Hot Chocolate','Peaceful','Winter'),(
53,'Black Russian','Cranky','Winter'),(
54,'Victor','Ambitious','Winter'),(
55,'Tomato Tang','Relieved','Winter'),(
56,'Spice 75','Hopeful','Winter'),(
57,'Egg Nog','Festive','Winter'),(
58,'Old Fashioned','Celebratory','Fall'),(
59,'Blind Russian','Crushed','Fall'),(
60,'Cosmopolitan','Blissful','Fall'),(
61,'Cuba Libre','Calm','Fall'),(
62,'Amaretto Tea','Stressed','Fall'),(
63,'Espresso Martini','Excited','Fall'),(
64,'The Last Word','Energetic','Fall'),(
65,'Sazerac','Flirty','Fall'),(
66,'Alexander','Drained','Fall'),(
67,'Clove Cocktail','Disappointed','Fall'),(
68,'Grim Reaper','Gloomy','Fall'),(
69,'Vampiro','Anxious','Fall'),(
70,'Dirty Martini','Grumpy','Fall'),(
71,'Boston Sour','Peaceful','Fall'),(
72,'Adam','Cranky','Fall'),(
73,'Manhattan','Ambitious','Fall'),(
74,'Applecar','Relieved','Fall'),(
75,'Imperial Fizz','Hopeful','Fall'),(
76,'Halloween Punch','Festive','Fall');
	
/*!40000 ALTER TABLE `drink` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-08  9:14:54
