public class Duck extends Bird{
    
    private String featherColor;

    public Duck(String name, int age, int wingspan, String featherColor){
        super(name, age, wingspan);
        this.featherColor = featherColor;
    }

    public String getFeatherColor(){
        return featherColor;
    }

    @Override
    public String getNoise(){
        return "Quack";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + "Wingspan: " + getWingspan() + ", Feather color: " + getFeatherColor();
    }
}
