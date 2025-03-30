package lesson11;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int array1[] = {12, 2, 3, 45, 5, 7, 1};
        float averege = averageValue(array1);
        System.out.println("середнe значення елементів в масиві чисел= " + averege);
        reverse(array1);
        int[] resultMinAndMax = FindMinAndMax(array1);
        System.out.println("");
        System.out.println("min= " + resultMinAndMax[0]);
        System.out.println("max= " + resultMinAndMax[1]);
        //Створіть програму, яка перевіряє, чи є задане число присутнім у введеному користувачем масиві.
        int numberForSearch=5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array you want to check, please: ");

        if (scanner.hasNextInt()) {
            int sizeOfArray = scanner.nextInt();
            int[] arrayToCheck = new int[sizeOfArray];

            System.out.println("Enter " + sizeOfArray + " elements for the array, please: ");
            for (int i = 0; i < sizeOfArray; i++) {
                arrayToCheck[i] = scanner.nextInt();
            }
        boolean isPresent = false;
             for (int i = 0; i < sizeOfArray; i++) {
                 if (arrayToCheck[i] == numberForSearch) {
                     isPresent = true;
                     break;
                 }
             }

              if (isPresent) {
                   System.out.println("yes, the searchable number=  " + numberForSearch + " is in array");
               } else {
                   System.out.println("There is no searchable number=  " + numberForSearch + " in array");
                }
                 }
        else {
            System.out.println("It is not a number");
        }
        scanner.close();
        }



    // Створіть метод для обчислення середнього значення елементів в масиві чисел.
    public static int averageValue(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            result = result + array[i];
        }
        return result / array.length;
    }

    //Напишіть метод для виведення елементів масиву в зворотньому порядку.
    public static void reverse(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    //Реалізуйте функціонал для знаходження максимального і мінімального значення у масиві.
    public static int[] FindMinAndMax(int array[]) {
        Arrays.sort(array);
        int[] arrayMinAndMax = new int[2];
        arrayMinAndMax[0] = array[0];
        arrayMinAndMax[1] = array[array.length - 1];
        return arrayMinAndMax;
    }
}




