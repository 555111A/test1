package lesson14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word with XYZ inside, please: ");
        String word = scanner.next();
        int length = word.length();
        System.out.println("Length of word = " + length);
        boolean result = xyzMiddle(word);
        System.out.println("The provided word contains 'xyz' in the word: " + result);
        scanner.close();
    }

    public static boolean xyzMiddle(String word) {
        int length = word.length();
        int indexOfFirstLetter = word.indexOf("xyz");
        if (indexOfFirstLetter == -1) {
            return false;
        }
        int leftLength = indexOfFirstLetter;
        int rightLength = length - (indexOfFirstLetter + 3);
        return Math.abs(leftLength - rightLength) <= 1;
    }
}



