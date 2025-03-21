package lesson5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer, please!");
        int number = scanner.nextInt();
        int square = toSquare(number);
        System.out.println("The square of " + number + " is: " + square);

        System.out.print("Введіть радіус циліндра!");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра!");
        double height = scanner.nextDouble();
        double volume = volumeOfCylinder(radius, height);
        System.out.println("Об'єм циліндра= " + volume);

        System.out.print("Enter, please, the first number!");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter, please, the second number!");
        double secondNumber = scanner.nextDouble();
        double degreeRes = degree(firstNumber, secondNumber);
        System.out.println("Degree of firstNumber in secondNumber = " + degreeRes);
        scanner.close();
    }
    public static int toSquare(int number) {
        return number * number;
    }
    public static double volumeOfCylinder(double radius, double height) {
        double volumeOfCylinder=Math.PI * radius * radius * height;
        return volumeOfCylinder;
    }
    public static double degree (double firstNumber, double secondNumber) {
        double degree = Math.pow(firstNumber, secondNumber);
        return degree;
    }

}


