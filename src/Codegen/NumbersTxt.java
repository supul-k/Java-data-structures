package Codegen;

public class NumbersTxt {
    public static void main(String[] args) {

//        System.out.println(Codegen.NumbersToText.numbersToLetters("20 5 19 20+4 15 13 5"));

        NumbersToText number = new NumbersToText();
        var result = number.numbersToLetters("20 5 19 20+4 15 13 5");
        System.out.println("result string : " + result);
    }


}

class NumbersToText {

    public static String numbersToLetters(String input) {
        String[] words = input.split("\\+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String[] numbers = word.split(" ");

            for (String number : numbers) {
                int num = Integer.parseInt(number);
                char letter = (char) ('A' + num - 1);
                result.append(letter);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
}
