public class AIMSproj {
    public void main (String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDisc1 dvd1 = new DigitalVideoDisc1("StarWars", "Science Fiction", "Geogrge Lucas",87,19.95f);
        anOrder.addDigitalVideoDisc1(dvd1);
        DigitalVideoDisc1 dvd2 = new DigitalVideoDisc1("Dune", "Science Fiction", "Denis Villeneuve",87,24.95f);
        anOrder.addDigitalVideoDisc1(dvd2);
        DigitalVideoDisc1 dvd3 = new DigitalVideoDisc1("The Lion King", "Animation", "Rogers Allers",87,18.99f);
        anOrder.addDigitalVideoDisc1(dvd3);
        System.out.printf("Total Cost is: %.2f",anOrder.totalCost());

        System.out.println("\nBefore: \n");
        anOrder.printCart();
        anOrder.removeDigitalVideoDisc1(dvd1);
        System.out.println("After: \n");
        anOrder.printCart();   
    }
}