package lessons16;

public class Main {
    public static void main(String[] args) {
        System.out.println("Повернути кількість парних цілих чисел у заданому масиві:");
        System.out.println(catDog("dogcatdog"));
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        int[] num1 = {1, 2, 3, 4, 100};
        System.out.println("Повернути центроване середнє значення масиву цілих чисел:");
        System.out.println(centeredAverage(num1));
        System.out.println(" Повернути кількість парних цілих чисел у заданому масиві:");
         int[] num2={2, 1, 2, 3, 4, 8}
        System.out.println(countEvenInts(num2));
        System.out.println(" Повернути суму чисел у масиві оминаючи ділянки між 6 та 7:");
        int[]num3={6, 7, 1, 6, 7, 2}
        System.out.println(sumIgnoreSections(num3));
        System.out.println(" Повернути суму чисел у масиві:");
         int[]num4={1, 21, 13, 99, 100}
        System.out.println(sumWithoutUnlucky13(num4);

    }
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int index = 0; (index = str.indexOf("cat", index)) != -1; index += 3) {
            catCount++;
        }
        for (int index = 0; (index = str.indexOf("dog", index)) != -1; index += 3) {
            dogCount++;
        }
        return catCount == dogCount;
    }
    public static int centeredAverage(int[] num1) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : num1) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        sum =sum- min;
        sum =sum- max;
        return sum / (num1.length - 2);
    }
    public static int countEvenInts(int[] num2) {
        int count = 0;

        for (int num : num2) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    public static int sumIgnoreSections(int[] num3) {
        int sum = 0;
        boolean ignore = false;

        for (int num : num3) {
            if (num == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += num;
            }

            if (ignore && num == 7) {
                ignore = false;
            }
        }
        return sum;
    }
    public static int sumWithoutUnlucky13(int[] num4) {
        int sum = 0;
        for (int num : num4) {
            if (num == 13) {
                break;
            }
            sum += num;
        }
        return sum;
    }

}
