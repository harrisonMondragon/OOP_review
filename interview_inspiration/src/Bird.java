public class Bird extends Animal implements Flyable{

    private int wingspan;

    public Bird(String name, int age, int wingspan){
        super(name, age);
        this.wingspan = wingspan;
    }

    public int getWingspan(){
        return wingspan;
    }

    @Override
    public String getNoise(){
        return "Chirp";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Wingspan: " + getWingspan();
    }

    // Flyable overrides

    @Override
    public void fly(){
        System.out.println(getName() + " is flying");
    }

    @Override
    public void glide(int duration){
        System.out.println(getName() + " is gliding for " + duration + "mins");
    }

    @Override
    public void land(){
        System.out.println(getName() + " is landing");
    }
}
