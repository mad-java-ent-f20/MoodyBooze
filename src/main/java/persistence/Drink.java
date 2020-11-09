package persistence;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Drink")
@Table(name = "drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native", strategy="native")
    int id;

    @Column(name = "drink_name")
    String name;
    @Column(name = "drink_mood")
    String mood;
    @Column(name = "drink_season")
    String weather;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getWeather() {
        return weather;
    }

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
