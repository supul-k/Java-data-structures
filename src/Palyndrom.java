public class Palyndrom {



    public boolean isPalyndrom(int num){

        int out = 0;
        int temp = num;
        boolean isPal = false;

        while(num != 0){

            out = num%10 + out*10;
            num /= 10;
        }

        if (temp == out && temp >=0 ) {
            isPal = true;
        } else {
            isPal = false;
        }

        return isPal;
    }

    public static void main(String[] args) {
        Palyndrom p = new Palyndrom();

        System.out.println(p.isPalyndrom(1312131));;

    }
}
