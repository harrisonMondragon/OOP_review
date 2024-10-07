public class Cat extends Animal{
    
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
}
