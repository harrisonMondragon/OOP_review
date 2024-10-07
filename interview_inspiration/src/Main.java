public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        Shelter myShelter = new Shelter("Hairball's Sanctuary");

        Dog myDog = new Dog("Kip", 10, true);
        Cat myCat = new Cat("Leia", 5, 9);
        Bird myBird = new Bird("TicTac", 3, "blue");
        Otter myOtter = new Otter("Carl", 7, true);
        Duck myDuck = new Duck("Glep", 22, "Blue-brown");

        myShelter.addAnimal(myDog);
        myShelter.addAnimal(myCat);
        myShelter.addAnimal(myBird);
        myShelter.addAnimal(myOtter);
        myShelter.addAnimal(myDuck);

        myShelter.displayShelter(true);
    }
}