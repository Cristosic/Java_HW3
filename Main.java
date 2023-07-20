import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        comparison(10.63f, 10.94f, 10);
        calculate(2800);

    }

    public static void comparison(float a, float b, float c) {

        if (Math.abs(a - c) < Math.abs(b - c)) System.out.println("a is closer to " + c + " then b");
        else System.out.println("b is closer to " + c + "then a");

        System.out.println("--------------------------");
    }

    public static void calculate(int seconds) {

        int n = seconds / 3600;
        if (n >= 8) System.out.println("It's more than our workday");
        else if (n >= 5) System.out.println("left" + seconds / 3600 + "hours");
        else if (n / 3600 < 5 && n / 3600 >= 2) System.out.println("left" + seconds / 3600 + "hours");
        else if (n/ 3600 < 2 && n / 3600 >= 1) System.out.println("left 1 hour");
        else if (n / 3600 < 1 && n / 3600 >= 0) System.out.println("left less than 1 hour");
        else System.out.println("Number must be positive");

    }

}