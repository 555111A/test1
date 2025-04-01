package lesson13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  any word, please!");
        String word1 = scanner.next();
        System.out.print("Enter  any word one more time, please!");
        String word2 = scanner.next();
        String mixingResult=mixString(word1, word2);
        System.out.println("Result of mixing is "+ mixingResult);
            scanner.close();
    }

    public static String mixString (String word1, String word2){
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        System.out.println(minLength);

        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if (word1.length() > minLength) {
            result.append(word1.substring(minLength));
        }
        if (word2.length() > minLength) {
            result.append(word2.substring(minLength));
        }
        return result.toString();
    }
}