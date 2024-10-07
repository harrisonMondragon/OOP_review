import java.util.ArrayList;

public class Shelter {

    private String name;
    private ArrayList<Animal> animals;

    public Shelter(String name){
        animals = new ArrayList<>();
        this.name = name;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public String getName(){
        return name;
    }

    public void displayShelter(boolean withNoise){

        System.out.println("Animals of the "  + name + " shelter:");

        for(Animal animal: animals){

            String message = "Type: " + animal.getClass().getSimpleName() + ", " + animal.toString();
        
            if(withNoise){
                message += ", Says: " + animal.getNoise();
            }

            System.out.println(message);
        }

        System.out.println();
    }

}
