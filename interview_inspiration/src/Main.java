public class Main {
    public static void main(String[] args){
        System.out.println("Hello world\n");

        Shelter myShelter = new Shelter("Hairball's Sanctuary");

        Dog myDog = new Dog("Kip", 10, true);
        Cat myCat = new Cat("Leia", 5, 9);
        Bird myBird = new Bird("TicTac", 3, 26);
        Otter myOtter = new Otter("Carl", 7, true);
        Duck myDuck = new Duck("Glep", 22, 92,"Blue-brown");

        myShelter.addAnimal(myDog);
        myShelter.addAnimal(myCat);
        myShelter.addAnimal(myBird);
        myShelter.addAnimal(myOtter);
        myShelter.addAnimal(myDuck);

        myShelter.displayShelter(true);

        myDuck.fly();
        myDuck.glide(20);
        myDuck.land();

        myOtter.swim();
        myOtter.dive(9);
        myOtter.surface();

        myDuck.swim();
        myDuck.dive(3);
        myDuck.surface();

        myOtter.walk();
        myOtter.changeSpeed(2);
        myOtter.stop();

        System.out.println();
        myShelter.exerciseAnimals();

    }
}