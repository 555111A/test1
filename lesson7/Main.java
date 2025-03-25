package lesson7;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  any number you would like to check, please!");
        if (scanner.hasNextInt()) {
            int numberToCheck = scanner.nextInt();
            boolean result=isPerfectSquare(numberToCheck);
            if (result){
                System.out.println(numberToCheck + " - is a 'square' number");
            } else{
                
                System.out.println(numberToCheck + " -is is NOT a 'square' number");
            }
        } else {
            System.out.println("It is not a number");
        }
        scanner.close();
}

    public static boolean isPerfectSquare(int numberToCheck){
        int squareNumber = (int) Math.sqrt(numberToCheck);
        if (squareNumber * squareNumber == numberToCheck) {
        return true;
        } else {
        return false;
        }
  }
}