public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        Shelter myShelter = new Shelter("Hairball's Sanctuary");

        Dog myDog = new Dog("Kip", 10, true);
        Cat myCat = new Cat("Leia", 5, 9);

        myShelter.addAnimal(myDog);
        myShelter.addAnimal(myCat);

        myShelter.displayShelter(true);
    }
}