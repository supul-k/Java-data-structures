public class Inheritance {

    public static class Animal{
        int legs;
        String name;
        void eat(){
            System.out.println(name + " eating and have " + legs + " legs.");
        }


    }

    public static class Bird  extends Animal{
        public void fly(){
            System.out.println("can fly");
        }
    }

    public static class Fish extends  Animal{
        public void swim(){
            System.out.println("can swim");
        }
    }

    public static void main(String [] args) {

        Bird eagle = new Bird();
        Fish goldfish = new Fish();
        eagle.legs = 2;
        eagle.name = "eagle";
        eagle.eat();
        eagle.fly();

        goldfish.legs = 0;
        goldfish.name = "gold fish";
        goldfish.eat();
        goldfish.swim();
    }
}
