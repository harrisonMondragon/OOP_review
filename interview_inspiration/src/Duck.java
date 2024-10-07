public class Duck extends Animal{
    
    private String featherColor;

    public Duck(String name, int age, String featherColor){
        super(name, age);
        this.featherColor = featherColor;
    }

    public String getFeatherColor(){
        return featherColor;
    }

    public String getNoise(){
        return "Quack";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + ", Feather color: " + getFeatherColor();
    }
}
