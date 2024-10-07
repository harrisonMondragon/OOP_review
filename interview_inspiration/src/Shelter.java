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

    public void exerciseAnimals(){

        for(Animal animal: animals){
            if(animal instanceof Walkable){
                ((Walkable) animal).walk();
            }
            if(animal instanceof Swimmable){
                ((Swimmable) animal).swim();
            }
            if(animal instanceof Flyable){
                ((Flyable) animal).fly();
            }
            System.out.println(animal.getName() + " says " + animal.getNoise() + " to thank you for letting them blow off some steam :)\n");
        }
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
