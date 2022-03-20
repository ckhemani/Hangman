
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        welcometoHangmanGame();
        missedLetter();
        randomWord();
        String test[]= generateRandomWords(1);
        System.out.println(Arrays.toString(test));
    }

    public static void welcometoHangmanGame(){
        System.out.println("\n HANGMAN \n\n " +
                "+---+ \n\n" +
                "    | \n\n" +
                "    | \n\n" +
                "    | \n\n" +
                "    ===\n\n");
    }

    public static void missedLetter(){
        System.out.println("---");
//        System.out.println("Please Guess a Letter\n");
//        String temp = input.next();
//        System.out.println("Guess");
    }

    public static void randomWord(){
        System.out.println("\n Generate a Random word");
        Random randomWord = new Random();
        int number = randomWord.nextInt(20);
        System.out.println("Random Word generated is : " + number);
    }
    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
//            char[] word = new char[random.nextInt(1)+3]; // words of length 3 through 10.
            char[] word = new char[random.nextInt(1)+4]; // words of length 3 through 10.
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(58));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

//    https://www.geeksforgeeks.org/generate-random-string-of-given-size-in-java/
    // Java program generate a random AlphaNumeric String
// using Regular Expressions method

//    class RandomString {
//
//        static String getAlphaNumericString(int n)
//        {
//
//            // length is bounded by 256 Character
//            byte[] array = new byte[256];
//            new Random().nextBytes(array);
//
//            String randomString
//                    = new String(array, Charset.forName("UTF-8"));
//
//            // Create a StringBuffer to store the result
//            StringBuffer r = new StringBuffer();
//
//            // remove all spacial char
//            String AlphaNumericString
//                    = randomString
//                    .replaceAll("[^A-Za-z0-9]", "");
//
//            // Append first 20 alphanumeric characters
//            // from the generated random String into the result
//            for (int k = 0; k < AlphaNumericString.length(); k++) {
//
//                if (Character.isLetter(AlphaNumericString.charAt(k))
//                        && (n > 0)
//                        || Character.isDigit(AlphaNumericString.charAt(k))
//                        && (n > 0)) {
//
//                    r.append(AlphaNumericString.charAt(k));
//                    n--;
//                }
//            }
//
//            // return the resultant string
//            return r.toString();
//        }
//
//        public static void main(String[] args)
//        {
//            // size of random alphanumeric string
//            int n = 20;
//
//            // Get and display the alphanumeric string
//            System.out.println(getAlphaNumericString(n));
//        }
//    }

}
