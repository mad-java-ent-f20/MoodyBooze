package entity;

/**
 * The type Drink name.
 */
public class DrinkName {

    public DrinkName() {
    }

    public DrinkName(String drinkName) {
        DrinkName = drinkName;
    }

    /**
     * The Drink name.
     */
    String DrinkName;

    @Override
    public String toString() {
        return "DrinkName{" +
                "DrinkName='" + DrinkName + '\'' +
                '}';
    }

    /**
     * Gets drink name.
     *
     * @return the drink name
     */
    public String getDrinkName() {
        return DrinkName;
    }

    /**
     * Sets drink name.
     *
     * @param drinkName the drink name
     */
    public void setDrinkName(String drinkName) {
        DrinkName = drinkName;
    }
}
