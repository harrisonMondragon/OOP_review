public class Dog extends Animal{
    
    private boolean barksAtStrangers;

    public Dog(String name, int age, boolean barksAtStrangers){
        super(name, age);
        this.barksAtStrangers = barksAtStrangers;
    }

    public boolean getBarksAtStrangers(){
        return barksAtStrangers;
    }

    @Override
    public String getNoise(){
        return "Woof";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Barks at strangers: " + getBarksAtStrangers();
    }
}
