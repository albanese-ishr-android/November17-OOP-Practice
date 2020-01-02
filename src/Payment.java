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

    private FoodItem[] fi = new FoodItem[100];
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

    public void addFoodItem(FoodItem foodItem) {
        fi[fiCount] = foodItem;
        fiCount++;
    }


    // addDrinkItem() – this method adds a new DrinkItem object

    //TODO 8: Implement this method.
    public static double findPrice(Item[] pl, String c) {

        Boolean isFound = false;
        int i = 0;
        double price = 0;

        while (!isFound) {
            Item item = pl[i];
            if (item.getCode() == c) {
                price = item.getPrice();
                isFound = true;
            }
            i++;
        }

        return price;
    }

//TODO 9: Construct this method.
public double calculateBill(Item[] items) {

    double bill = 0;

    for (int i = 0; i < fi.length; i++) {
        FoodItem currentFoodItem = fi[i];
        String code = currentFoodItem.getItemCode();
        double priceCurrentFoodItem = findPrice(items, code);
        double priceWithTax = priceCurrentFoodItem * currentFoodItem.getQuantity() * foodTax;
        bill = bill + priceWithTax;
    }

    for (int i = 0; i < di.length; i++) {
        DrinkItem currentDrinkItem = di[i];
        String code = currentDrinkItem.getItemCode();
        double priceCurrentDrinkItem = findPrice(items, code);
        double priceWithTax = priceCurrentDrinkItem * currentDrinkItem.getQuantity() * drinkTax;
        bill = bill + priceWithTax;
    }

    return 0;
}

//Getters and setters.

    public DrinkItem getDi(int x) {
        return di[x];
    }

    public static double getFoodTax() {
        return foodTax;
    }

    public static void setFoodTax(double foodTax) {
        Payment.foodTax = foodTax;
    }

    public static double getDrinkTax() {
        return drinkTax;
    }

    public static void setDrinkTax(double drinkTax) {
        Payment.drinkTax = drinkTax;
    }

    public FoodItem[] getFi() {
        return fi;
    }

    public void setFi(FoodItem[] fi) {
        this.fi = fi;
    }

    public int getFiCount() {
        return fiCount;
    }

    public void setFiCount(int fiCount) {
        this.fiCount = fiCount;
    }

    public DrinkItem[] getDi() {
        return di;
    }

    public void setDi(DrinkItem[] di) {
        this.di = di;
    }

    public int getDiCount() {
        return diCount;
    }

    public void setDiCount(int diCount) {
        this.diCount = diCount;
    }
}