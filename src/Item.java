//The price of each item is stored in an object of the Item class.
public class Item {
    private String code; // item code
    private String name; // item name
    private double price; // unit price before tax

    public Item(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    /*
        These getters and setters are not in the exam paper. They are there though. They are not printed just to save
        paper.
         */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
