public class Encapsulation {

    class Person{

        private String name;
        private int age;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }


    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
        encap.start();
    }

    public void start(){

        Person p = new Person();
        p.setName("Supul");
        p.setAge(24);

        System.out.println("Student name is :" + p.getName());
        System.out.println("Student age is :" + p.getAge());

    }
}
