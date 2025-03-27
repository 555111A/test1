package lesson10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  any number, please!");
        if (scanner.hasNextInt()) {
            int numberToCheck = scanner.nextInt();
            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck + "- простe число");
            } else {
                System.out.println(numberToCheck + " - не простe число");
            }
            scanner.close();
        }
        else {
            System.out.println("It is not a number");
        }
    }
    public static boolean  isPrime(int numberToCheck) {
            if (numberToCheck <= 1) {
                return false;
            }
            for (int i = 2; i < numberToCheck; i++) {
                if (numberToCheck % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


