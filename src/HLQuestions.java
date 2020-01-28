import java.util.LinkedList;

public class HLQuestions {

    public static LinkedList<Item> priceLL = new LinkedList<>();

    public static void main(String[] args) {

        initializeLinkedList();
        changePrice(priceLL, "MEATVEGDSSD", 43.32);
    }


    public static void changePrice(LinkedList<Item> itemList, String itemCode, double newPrice) {
        int i = 0;
        int listSize = itemList.size();
        boolean itemFound = false;

        while (i < listSize && !itemFound) {

            Item currentItem = itemList.get(i);
            if (currentItem.getCode().equals(itemCode)) {
                currentItem.setPrice(newPrice);
                System.out.println("Price updated.");
                itemFound = true;
            }

            i = i + 1;
        }

        if (!itemFound) {
            System.out.println("Item not found.");
        }

    }


    public static void changePriceIterator(LinkedList<Item> itemList, String itemCode, float newPrice) {

    }

    public static void initializeLinkedList() {
        Item steaks = new Item("MD", "Steaks", 12.90);
        Item bread = new Item("CARB", "Italian Bread", 3.50);
        Item fish = new Item("MEATVEG", "Fish", 17.09);
        Item salad = new Item("PET-FOOD", "It's just leaves", 23.00);

        priceLL.add(steaks);
        priceLL.add(bread);
        priceLL.add(fish);
        priceLL.add(salad);
    }
}
