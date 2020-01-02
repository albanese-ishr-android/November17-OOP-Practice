public class RestaurantDriver {
    /*
   The global variable tables is declared as follows:
     The indices in this array represent the table number, so tables[1] is a Payment object for the customers
      occupying table number 1.
     */
    static Payment[] tables = new Payment[50];
    //TODO: 4 Describe the purpose of the following statement.
    private FoodItem[] fi = new FoodItem[100];

    /*
    Remember every Java program needs a class with a main() method to actually execute any code.
     */
    public static void main(String[] args) {

        /*
        TODO 6: The indices in this array represent the table number, so tables[1] is a Payment object for
         the customers occupying table number 1. The driver (main) class contains the following code. Note: You can assume that all
         appropriate accessor and mutator methods have been included in their respective classes.
         State the output of this code.
         */

        tables[1] = new Payment();
        tables[2] = new Payment();
        FoodItem a = new FoodItem("f102", 2);
        FoodItem b = new FoodItem("f100", 1);
        DrinkItem c = new DrinkItem("d102", 3);
        tables[1].addFoodItem(a);
        tables[1].addFoodItem(b);
        tables[2].addDrinkItem(c);
        tables[2].addDrinkItem(new DrinkItem("d103", 1));
        System.out.println(tables[1].getFiCount());
        System.out.println(Payment.getFoodTax());
        System.out.println(tables[2].getDi(1).getItemCode());


        /*
        TODO 7 Construct statements, in code, that will print out the following:
         (i) The number of drink items ordered by table 40. [1]
         (ii) The item code of the third food item ordered by table 2.
         */
    }
}
