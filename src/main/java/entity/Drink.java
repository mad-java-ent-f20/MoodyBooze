package entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Drink.
 */
@Entity(name = "Drink")
@Table(name = "drink")
public class Drink {

    /**
     * The Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native", strategy="native")
    int id;

    /**
     * The Name.
     */
    @Column(name = "drink_name")
    String name;
    /**
     * The Mood.
     */
    @Column(name = "drink_mood")
    String mood;


    /**
     * The Weather.
     */
    @Column(name = "drink_season")
    String weather;

    /**
     * Instantiates a new Drink.
     */
    public Drink() {
    }

    /**
     * Instantiates a new Drink.
     *
     * @param name    the name
     * @param mood    the mood
     * @param weather the weather
     */
    public Drink(String name, String mood, String weather) {
        this.name = name;
        this.mood = mood;
        this.weather = weather;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets mood.
     *
     * @param mood the mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * Gets weather.
     *
     * @return the weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Sets weather.
     *
     * @param weather the weather
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }


    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mood='" + mood + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
