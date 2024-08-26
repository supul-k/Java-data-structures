public class Reverse {

    public static void main( String [] args){

        String s = "supul";
        System.out.println(s.toCharArray().length);

        char[] sk = s.toCharArray();

        char[] str = {'s','u','p','u','l' };

        for (int i = sk.length - 1; i >= 0; i--){

            System.out.print(sk[i]);

        }

    }
}
