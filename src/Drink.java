/**
 * Created by halleyfroeb on 8/29/16.
 * Stores information of a Drink order
 */
public class Drink {
    String drinkName;
    boolean nonAlcoholic;
    int orderNumber;

    public Drink(String drinkName, boolean nonAlcoholic, int orderNumber) {
        this.drinkName = drinkName;
        this.nonAlcoholic = nonAlcoholic;
        this.orderNumber = orderNumber;
    }

    public String getDrinkName(String drinkName) {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public boolean getNonAlcoholic(boolean nonAlcoholic) {
        return nonAlcoholic;
    }

    public void setNonAlcoholic(boolean nonAlcoholic) {
        this.nonAlcoholic = nonAlcoholic;
    }

    public int getOrderNumber(int orderNumber) {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void checkId() {
        if (nonAlcoholic != true) {
            System.out.println("Please Check ID");
        }
    }
}





