public class Bird extends Animal {

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
}
