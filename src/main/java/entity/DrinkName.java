package entity;

import java.util.List;

public class DrinkName {

    List DrinkName;

    @Override
    public String toString() {
        return "DrinkName{" +
                "DrinkName='" + DrinkName + '\'' +
                '}';
    }

    public List getDrinkName() {
        return DrinkName;
    }

    public void setDrinkName(List drinkName) {
        DrinkName = drinkName;
    }
}
