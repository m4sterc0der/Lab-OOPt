import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<DigitalVideoDisc1> itemOrdered = new ArrayList<>();
    private float totalCost = 0;
    public void addDigitalVideoDisc1 (DigitalVideoDisc1 a) {
        itemOrdered.add (a);
    }
    public void removeDigitalVideoDisc1 (DigitalVideoDisc1 a) {
        for (DigitalVideoDisc1 it: itemOrdered) {
            if (it.equals(a)) {
                itemOrdered.remove(it);
                break;
            }
        }
    }
    public float totalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc1 it: itemOrdered) {
            totalCost += it.getCost();
        }
        return totalCost;
    }
    public void printCart() {
        for (DigitalVideoDisc1 it: itemOrdered) {
            it.displayDVD();
            System.out.println('\n');
        }
    }
}
