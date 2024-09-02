package OOP;

public class Abstraction {

    abstract class Animal{
        public abstract void makeSound();

        public void eat(){

            System.out.println("Animal eats anything");
        }
    }

    class Fish extends Animal{
        public void makeSound() {
            System.out.println("Fishes are making some sounds in the water");
        }
    }

    public static void main(String[] args) {
        Abstraction abs = new Abstraction();
        abs.start();
    }

    public void start(){

        Fish f = new Fish();

        f.makeSound();
        f.eat();

    }
}
