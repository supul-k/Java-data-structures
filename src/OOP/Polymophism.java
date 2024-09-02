package OOP;

public class Polymophism {

    public class Phone{
        public void make_a_call(){
            System.out.println("can call some one");
        }
    }

    class MobilePhone extends Phone{
        public void make_a_call(){
            System.out.println("can call some one without using cables");
        }
    }

    class SmartPhone extends Phone{
        public void make_a_call(){
            System.out.println("can make online voice and video calls");
        }
    }

    public static void main(String[] args) {

        Polymophism poly = new Polymophism();
        poly.start();
    }

    public void start(){
        Phone p = new Phone();
        MobilePhone m = new MobilePhone();
        SmartPhone s = new SmartPhone();
        p.make_a_call();
        m.make_a_call();
        s.make_a_call();
    }
}
