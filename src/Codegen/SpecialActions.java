package Codegen;

public class SpecialActions {

    public static boolean matchKeyCombo(String input) {
        input = input.toLowerCase();

        int countQEE = 0;
        int countZCC = 0;

        for (int i = 0; i <= input.length() - 3; i++) {
            String combo = input.substring(i, i + 3);
            if (combo.equals("qee")) {
                countQEE++;
            } else if (combo.equals("zcc")) {
                countZCC++;
            }
        }

        return countQEE == countZCC;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(matchKeyCombo("QEEQEEzcczcc")); // true
        System.out.println(matchKeyCombo("QEEqeeZcc")); // true
        System.out.println(matchKeyCombo("QEEzccZCCqee")); // true
        System.out.println(matchKeyCombo("QEEQEEQEE")); // false
        System.out.println(matchKeyCombo("zccQEE")); // false
        System.out.println(matchKeyCombo("abcdef")); // true
    }
}
