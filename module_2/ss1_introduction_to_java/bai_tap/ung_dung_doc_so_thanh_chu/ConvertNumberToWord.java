import java.util.Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number want to convert to word: ");
        int number = sc.nextInt();
        String word = "";
        if (number >= 0 && number <= 10) {
            switch (number) {
                case 0:
                    word = "zero";
                    break;
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;
                case 6:
                    word = "six";
                    break;
                case 7:
                    word = "seven";
                    break;
                case 8:
                    word = "eight";
                    break;
                case 9:
                    word = "nine";
                    break;
                case 10:
                    word = "ten";
                    break;
            }
        } else if (number > 10 && number <= 20) {
            switch (number) {
                case 11:
                    word = "eleven";
                    break;
                case 12:
                    word = "twelve";
                    break;
                case 13:
                    word = "thirteen";
                    break;
                case 14:
                    word = "fourteen";
                    break;
                case 15:
                    word = "fifteen";
                    break;
                case 16:
                    word = "sixteen";
                    break;
                case 17:
                    word = "seventeen";
                    break;
                case 18:
                    word = "eighteen";
                    break;
                case 19:
                    word = "nineteen";
                    break;
                case 20:
                    word = "twenty";
                    break;
            }
        } else if (number > 20 && number < 100) {
            int ones = number % 10;
            int tens = (number / 10) % 10;
            switch (tens) {
                case 2:
                    word += "twenty";
                    break;
                case 3:
                    word += "thirty";
                    break;
                case 4:
                    word += "fourty";
                    break;
                case 5:
                    word += "fifty";
                    break;
                case 6:
                    word += "sixty";
                    break;
                case 7:
                    word += "seventy";
                    break;
                case 8:
                    word += "eighty";
                    break;
                case 9:
                    word += "ninety";
                    break;
            }

            switch (ones) {
                case 0:
                    word += "";
                    break;
                case 1:
                    word += "-one";
                    break;
                case 2:
                    word += "-two";
                    break;
                case 3:
                    word += "-three";
                    break;
                case 4:
                    word += "-four";
                    break;
                case 5:
                    word += "-five";
                    break;
                case 6:
                    word += "-six";
                    break;
                case 7:
                    word += "-seven";
                    break;
                case 8:
                    word += "-eight";
                    break;
                case 9:
                    word += "-nine";
                    break;
            }
        } else if (number >= 100 && number < 1000) {
            int tensAndOnes = number % 100;
            int hundreds = (number / 100) % 10;
            switch (hundreds) {
                case 1:
                    word += "one hundred";
                    break;
                case 2:
                    word += "two hundred";
                    break;
                case 3:
                    word += "three hundred";
                    break;
                case 4:
                    word += "four hundred";
                    break;
                case 5:
                    word += "five hundred";
                    break;
                case 6:
                    word += "six hundred";
                    break;
                case 7:
                    word += "seven hundred";
                    break;
                case 8:
                    word += "eight hundred";
                    break;
                case 9:
                    word += "nine hundred";
                    break;
            }

            String subWord = "";
            if (tensAndOnes >= 0 && tensAndOnes <= 10) {
                switch (tensAndOnes) {
                    case 0:
                        subWord = "zero";
                        break;
                    case 1:
                        subWord = "one";
                        break;
                    case 2:
                        subWord = "two";
                        break;
                    case 3:
                        subWord = "three";
                        break;
                    case 4:
                        subWord = "four";
                        break;
                    case 5:
                        subWord = "five";
                        break;
                    case 6:
                        subWord = "six";
                        break;
                    case 7:
                        subWord = "seven";
                        break;
                    case 8:
                        subWord = "eight";
                        break;
                    case 9:
                        subWord = "nine";
                        break;
                    case 10:
                        subWord = "ten";
                        break;
                }
            } else if (tensAndOnes > 10 && tensAndOnes <= 20) {
                switch (tensAndOnes) {
                    case 11:
                        subWord = "eleven";
                        break;
                    case 12:
                        subWord = "twelve";
                        break;
                    case 13:
                        subWord = "thirteen";
                        break;
                    case 14:
                        subWord = "fourteen";
                        break;
                    case 15:
                        subWord = "fifteen";
                        break;
                    case 16:
                        subWord = "sixteen";
                        break;
                    case 17:
                        subWord = "seventeen";
                        break;
                    case 18:
                        subWord = "eighteen";
                        break;
                    case 19:
                        subWord = "nineteen";
                        break;
                    case 20:
                        subWord = "twenty";
                        break;
                }
            } else if (tensAndOnes > 20 && tensAndOnes < 100) {
                int ones = tensAndOnes % 10;
                int tens = (tensAndOnes / 10) % 10;
                switch (tens) {
                    case 2:
                        subWord += "twenty";
                        break;
                    case 3:
                        subWord += "thirty";
                        break;
                    case 4:
                        subWord += "fourty";
                        break;
                    case 5:
                        subWord += "fifty";
                        break;
                    case 6:
                        subWord += "sixty";
                        break;
                    case 7:
                        subWord += "seventy";
                        break;
                    case 8:
                        subWord += "eighty";
                        break;
                    case 9:
                        subWord += "ninety";
                        break;
                }

                switch (ones) {
                    case 0:
                        subWord += "";
                        break;
                    case 1:
                        subWord += "-one";
                        break;
                    case 2:
                        subWord += "-two";
                        break;
                    case 3:
                        subWord += "-three";
                        break;
                    case 4:
                        subWord += "-four";
                        break;
                    case 5:
                        subWord += "-five";
                        break;
                    case 6:
                        subWord += "-six";
                        break;
                    case 7:
                        subWord += "-seven";
                        break;
                    case 8:
                        subWord += "-eight";
                        break;
                    case 9:
                        subWord += "-nine";
                        break;
                }
            }
            word += " and " + subWord;
        } else {
            System.out.println("Over the boundary (0-999)");
        }
        System.out.println(word);
    }
}
