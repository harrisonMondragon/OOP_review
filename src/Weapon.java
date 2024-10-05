public class Weapon extends Item{
    
    private int damage;

    public Weapon(String name, int quantity, int damage){
        super(name, quantity);
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    // Runtime polymorphism - Overriding toString for weapons
    @Override
    public String toString(){
        return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage();
    }

    // Abstraction - Implementing abstract method getUse for weapons
    @Override
    public String getUse(){
        return "Hurt";
    }
}
