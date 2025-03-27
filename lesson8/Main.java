package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  any number from 1 to 5, please!");
        if (scanner.hasNextInt()) {
            int numberToCheck = scanner.nextInt();
            getGrade(numberToCheck);
            scanner.close();
        }
        else {
            System.out.println("It is not a number");
        }
    }
    public static void  getGrade(int numberToCheck) {
        if (numberToCheck > 0 && numberToCheck <= 5) {
            switch (numberToCheck) {
                case 1:
                    System.out.println("you got Погано");
                    break;
                case 2:
                    System.out.println("you got Погано but better than 1, you mark is " + numberToCheck);
                    break;
                case 3:
                    System.out.println("you got Three!");
                    break;
                case 4:
                    System.out.println("you got GOOD  and your mark is " + numberToCheck);
                    break;
                case 5:
                    System.out.println("you got  Відмінно=" + numberToCheck);
                    // break; - it is not necessary
            }
        } else {
            System.out.println("Неправильна оцінка " + numberToCheck);
        }
    }
}


