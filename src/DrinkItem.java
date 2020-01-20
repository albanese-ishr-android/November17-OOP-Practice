public class DrinkItem {

    private String itemCode;
    private int quantity;

    public DrinkItem(String x, int y) {
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
