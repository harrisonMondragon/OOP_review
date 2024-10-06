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
            if(withNoise){
                System.out.println(animal.toString() + ", Says: " + animal.getNoise());
            }
            else{
                System.out.println(animal.toString());
            }
        }
    }

}
