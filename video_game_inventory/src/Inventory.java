import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    // Compile time polymorphism - Overload add item for fruits specifically
    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }

    // Compile time polymorphism - Overload add item for weapons specifically
    public void addItem(String name, int quantity, int damage){
        items.add(new Weapon(name, quantity, damage));
    }

    public void displayInventory(){
        for(Item item: items){
            System.out.println(item.toString() + ", Use: " + item.getUse());
        }
    }
}
