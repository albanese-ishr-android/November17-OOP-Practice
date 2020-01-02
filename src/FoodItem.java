public class FoodItem {

    //TODO: 3 Using two examples from this class (or any other one) explain the benefits of using different data types.

    /*
    Having different data types allow different operations to be carried out depending
upon the type;
eg
Calculations in the integer “quantity” variable;
which are not possible for a String;
Double instead of integer allows the use of decimals;
which mirrors real-life scenarios/allows more precise calculations;
Using an array (of objects);
Allows individual items to be accessed/processed more easily;
Memory usage can be reduced;
eg “fiCount” takes up less space as an integer than it would as a double
(assuming it’s just a number);
     */


    private String itemCode;
    private int quantity;

    public FoodItem(String x, int y) {
        itemCode = x;
        quantity = y;
    }


    /*
    Getters and setters are not in the exam paper but they are there.
     */
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
