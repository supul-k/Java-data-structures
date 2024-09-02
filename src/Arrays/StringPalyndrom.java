package Arrays;

public class StringPalyndrom {

    public boolean isPlyndrom( String str) {

        String output = "";
        boolean isPalyndrom = false;

        for (int i = 0; i < str.length(); i++){
            output = str.charAt(i) + output;
        }

        if (str.equals(output)) {
            isPalyndrom = true;
        }
        System.out.println("Input : " + str);
        System.out.println("output : " + output);
        return isPalyndrom;
    }

    public boolean isPlyndrom2( String str) {

        int start = 0;
        int end = str.length() - 1;


        while ( start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        StringPalyndrom sPalyndrom = new StringPalyndrom();

        System.out.println(sPalyndrom.isPlyndrom2("xykyxz"));
    }
}
