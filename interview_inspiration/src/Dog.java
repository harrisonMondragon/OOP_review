public class Dog extends Animal implements Walkable{
    
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

    @Override
    public void walk(){
        System.out.println(getName() + " is walking on big paws");
    }

    @Override
    public void stop(){
        String message = getName() + " stops and sits";
        if(barksAtStrangers){
            message += " then barks at strangers";
        }
        System.out.println(message);
    }

    @Override
    public void changeSpeed(int speed){
        System.out.println(getName() + " starts running at " + speed + "ft/sec");
    }
}
