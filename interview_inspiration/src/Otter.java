public class Otter extends Animal{
    
    private boolean hasRock;

    public Otter(String name, int age, boolean hasRock){
        super(name, age);
        this.hasRock = hasRock;
    }

    public boolean getHasRock(){
        return hasRock;
    }

    @Override
    public String getNoise(){
        return "Squeak";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Has a rock: " + getHasRock();
    }
}
