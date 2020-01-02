public class Payment {

    private static double foodTax = 0.2; // 20 % sales tax added to
    private static double drinkTax = 0.1; // 10 % sales tax added to
    private int fiCount;
    // all food prices
    private DrinkItem[] di = new DrinkItem[100];
    private int diCount;

    // all drink prices
    public Payment() {
        fiCount = 0;
        diCount = 0;
    }

    // all other accessor and mutator methods are included
// addFoodItem() – this method adds a new FoodItem object
// addDrinkItem() – this method adds a new DrinkItem object
    public static double findPrice(Item[] pl, String c) { //code missing }
// calculateBill() – This method returns the bill (the total value of
// the items consumed for a particular table)
    }

    public DrinkItem getDi(int x) {
        return di[x];
    }
