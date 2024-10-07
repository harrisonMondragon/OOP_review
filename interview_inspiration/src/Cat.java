public class Cat extends Animal implements Walkable{
    
    private int lives;

    public Cat(String name, int age, int lives){
        super(name, age);
        this.lives = lives;
    }

    public int getLives(){
        return lives;
    }

    @Override
    public String getNoise(){
        return "Meow";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Lives: " + getLives();
    }

    // Walkable overrides

    @Override
    public void walk(){
        System.out.println(getName() + " is walking on little paws");
    }

    @Override
    public void stop(){
        System.out.println(getName() + " stops and stretches out");
    }

    @Override
    public void changeSpeed(int speed){
        System.out.println(getName() + " stars trotting at " + speed + "ft/sec");
    }
}
