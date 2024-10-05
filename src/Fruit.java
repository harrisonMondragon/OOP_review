public class Fruit extends Item {

    private String type;

    public Fruit(String name, int quantity, String type){
        super(name, quantity);
        this.type = type;
    }

    public String getType(){
        return type;
    }

    // Runtime polymorphism - Overriding toString for fruits
    @Override
    public String toString(){
        return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType();
    }

    // Abstraction - Implementing abstract method getUse for weapons
    @Override
    public String getUse(){
        return "Eat";
    }
}
