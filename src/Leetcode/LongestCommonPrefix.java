package Leetcode;

public class LongestCommonPrefix {

    public String LngCommonPrefix(String[] strs) {

        int maxLength = 0;
        String maxStr = "";
        boolean isPrefix = false;
        String prefix = "";

        for (String str : strs) {
            if (str.length() > maxLength) {
                maxStr = str;
            }
        }

        for (int i = maxStr.length(); i > 1 ; i--) {

            for ( String str : strs) {

                if ( str.startsWith(maxStr.substring(0, i))) {

                    isPrefix = true;
                    prefix = maxStr.substring(0, i);

                } else {

                    isPrefix = false;
                    break;

                }

            }

        }
        System.out.println("Longest CommonPrefix : " + prefix );
        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = { "flower", "flow", "flight" };
        String[] strs1 = { "dog","racecar","car" };

        LongestCommonPrefix lCommonPre = new LongestCommonPrefix();

        lCommonPre.LngCommonPrefix(strs1);

    }

}
