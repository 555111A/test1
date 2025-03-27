package lesson9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number, please");
        int N = scan.nextInt();
        if (N <= 0) {
            System.out.println("N should be bigger than 0, so this is the wrong value");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of "+ N+ " is "+ sum);
    }
}
