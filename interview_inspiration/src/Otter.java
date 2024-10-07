public class Otter extends Animal implements Swimmable, Walkable{
    
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

    // Swimmable overrides

    @Override
    public void swim(){
        System.out.println(getName() + " is swimming with streamlined body");
    }

    @Override
    public void surface(){
        System.out.println(getName() + " is surfacing by floating their back");
    }

    @Override
    public void dive(int depth){
        System.out.println(getName() + " is diving to " + depth + "ft");
    }

    // Walkable overrides

    @Override
    public void walk(){
        System.out.println(getName() + " is walking on little feet");
    }

    @Override
    public void stop(){
        String message = getName() + " stops and sits";
        if(hasRock){
            message += " then plays with thier rock";
        }
        System.out.println(message);
    }

    @Override
    public void changeSpeed(int speed){
        System.out.println(getName() + " stars strolling at " + speed + "ft/sec");
    }
}
