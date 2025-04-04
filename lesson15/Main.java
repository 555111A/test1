package lesson15;

public class Main {
    public static void main(String[] args) {
        String wordForTest1= "zipXuyuuuuuuuyzap";
        String wordForTest2= "abc.xyz";
        System.out.println(zipZap(wordForTest1));
        boolean result=xyzThere(wordForTest2);
        System.out.println(zipZap("xyzThere=  " +result));
    }

    public static String zipZap(String str) {// task 7.4
        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < str.length() - 2; i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'Z') &&
            (str.charAt(i + 2) == 'p' || str.charAt(i + 2) == 'P')) {
                result.setCharAt(i + 1, ' ');
            }
        }
        String resultWithNoSpaces = result.toString().replace(" ", "");
        return resultWithNoSpaces;
    }

    public static boolean xyzThere(String wordForTest2) { // task 7.5
        for (int i = 0; i <= wordForTest2.length() - 3; i++) {
            if (wordForTest2.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || wordForTest2.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
}
