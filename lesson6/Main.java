package lesson6;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter provide your age, please!");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println(checkAge(age));
        } else {
            System.out.println("It is not correct age");
        }
        scanner.close();

    }
    public static String checkAge(int age) {
        if (age >= 18) {
            return "You are an adult";
        } else {
            return "You are a child";
        }
    }
}


