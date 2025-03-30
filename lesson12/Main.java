package lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  any word, please!");
        String word = scanner.next();
        int length = word.length();
        System.out.print("Enter  any number, please, but smaller than "+length);
        if (scanner.hasNextInt()) {
            int desiredLength = scanner.nextInt();
            if(desiredLength>length){
                System.out.println("The length of word is smaller than desired length");
            }else{
               String result= repeatEnd(word, desiredLength);
                System.out.println(result);
            }
            scanner.close();
        }
        else {
            System.out.println("It is not a number");
        }

    }
    public static String repeatEnd (String word, int desiredLength){
        String lastNChars = word.substring(word.length() - desiredLength);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < desiredLength; i++) {
            result.append(lastNChars);
        }
        return result.toString();
    }
}
