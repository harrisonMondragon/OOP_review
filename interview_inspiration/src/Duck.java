public class Duck extends Bird implements Swimmable{
    
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
        return super.toString() + ", Feather color: " + getFeatherColor();
    }

    // Swimmable overrides

    @Override
    public void swim(){
        System.out.println(getName() + " is swimming with webbed feet");
    }

    @Override
    public void surface(){
        System.out.println(getName() + " is surfacing by floating upright");
    }

    @Override
    public void dive(int depth){
        System.out.println(getName() + " is diving to " + depth + "ft");
    }
}
