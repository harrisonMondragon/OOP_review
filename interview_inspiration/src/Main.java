public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        Dog myDog = new Dog("Kip", 10, true);
        Cat myCat = new Cat("Leia", 5, 9);

        System.out.println(myDog.toString());
        System.out.println(myDog.getNoise());

        System.out.println(myCat.toString());
        System.out.println(myCat.getNoise());
    }
}