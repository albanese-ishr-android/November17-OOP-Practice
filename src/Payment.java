public class Payment {

    //TODO: 2 - State the implication of the modifier "static" in this class.
    /*
    EITHER
    The values of these (static) variables;
    Are the same for all objects;
    They belong to the class (not to the objects);
    And are only created/declared once;
    Note: Do not accept “cannot be changed”.
    OR
    The static methods;
    Are class methods (not object methods);
    Are independent of the objects in the class;
     */

    private static double foodTax = 0.2; // 20 % sales tax added to
    private static double drinkTax = 0.1; // 10 % sales tax added to

    private int fiCount = 0;

    // all food prices
    private DrinkItem[] di = new DrinkItem[100];
    private int diCount = 0;

    // all drink prices
    //TODO: 1 How could we initialize these variables without using the constructor? Initialize in the declation.
    public Payment() {

    }

    // all other accessor and mutator methods are included

    //TODO: 5 The Payment class method addFoodItem() is passed a FoodItem object as a parameter. Complete this method.

    addFoodItem()


    // addDrinkItem() – this method adds a new DrinkItem object

    //TODO 8: Implement this method.
    public static double findPrice(Item[] pl, String c) {
        //code missing

        return 0; //This is not the right return value.
    }

/*
TODO 9: Construct this method.
calculateBill() {
// This method returns the bill (the total value of the items consumed for a particular table)
    }
 */

    public DrinkItem getDi(int x) {
        return di[x];
    }

}