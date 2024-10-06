public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        Inventory myInventory = new Inventory();

        Fruit myFruit = new Fruit("Apple", 20, "Fuji");
        Weapon myWeapon = new Weapon("Sword", 2, 75);

        myInventory.addItem(myFruit);
        myInventory.addItem(myWeapon);
        myInventory.addItem("Bananna", 10, "Plantain");
        myInventory.addItem("Hammer", 1, 25);

        myInventory.displayInventory();
    }
}