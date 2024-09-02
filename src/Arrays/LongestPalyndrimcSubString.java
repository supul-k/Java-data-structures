package Arrays;

public class LongestPalyndrimcSubString {

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

    public int LongestSubString ( String str) {

        String subStr = "";
        String maxSubStr = "";
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j <= str.length(); j++){
                subStr = str.substring(i, j);
                System.out.println("Sub String : " + subStr);
                if (isPlyndrom(subStr)) {
                    if (j - i > maxLength){
                        maxLength = j - i;
                        maxSubStr = subStr;
                    }
                }
            }
        }

        System.out.println("Biggest Palyndromic Sub string is : " + maxSubStr);
        return maxLength;
    }

    public static void main(String[] args) {

        LongestPalyndrimcSubString sPalyndrom = new LongestPalyndrimcSubString();

        System.out.println(sPalyndrom.LongestSubString("aab"));
//        System.out.println(sPalyndrom.isPlyndrom("xabax"));
    }
}
