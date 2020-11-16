package entity;

public class DrinkName {

    String DrinkName;

    @Override
    public String toString() {
        return "DrinkName{" +
                "DrinkName='" + DrinkName + '\'' +
                '}';
    }

    public String getDrinkName() {
        return DrinkName;
    }

    public void setDrinkName(String drinkName) {
        DrinkName = drinkName;
    }
}
