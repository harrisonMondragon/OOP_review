public class Bird extends Animal {

    private String color;

    public Bird(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String getNoise(){
        return "Chirp";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Color: " + getColor();
    }
}
