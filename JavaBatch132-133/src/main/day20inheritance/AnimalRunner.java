package main.day20inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat=new Cat(); //this code will create an object from Cat class
        myCat.eat();
        myCat.drink();
        myCat.meow();


        Dog myDog=new Dog();
        myDog.eat();
        myDog.drink();
        myDog.bark();

        Bird myBird=new Bird();
        myBird.eat();
        myBird.drink();
        myBird.tweet();

    }
}
