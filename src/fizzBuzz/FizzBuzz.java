package fizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(String number) {
        int num = Integer.parseInt(number);
        if (num < 0 || num > 100) {
            return "Wrong!!!";
        } else {
            if (num % 15 == 0) {
                return "FizzBuzz";
            } else if (num % 5 == 0 || containFive(number)) {
                return "Buzz";
            } else if (num % 3 == 0 || containThree(number)) {
                return "Fizz";
            } else {
                return convertToWord(number);
            }
        }
    }

    public static boolean containThree(String number) {
        boolean check = false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3') {
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean containFive(String number) {
        boolean check = false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '5') {
                check = true;
                break;
            }
        }
        return check;
    }

    public static String convertToWord(String number) {
        char[] numberbyWord = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] wordConvert = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mươi"};
        String firstWord = "";
        String secondWord = "";
        for (int j = 0; j < numberbyWord.length; j++) {
            if (number.charAt(0) == numberbyWord[j]) {
                firstWord += wordConvert[j];
                break;
            }
        }
        for (int j = 0; j < numberbyWord.length; j++) {
            if (number.charAt(1) == numberbyWord[j]) {
                secondWord += wordConvert[j];
                break;
            }
        }
        return firstWord + " " + secondWord;
    }
}
