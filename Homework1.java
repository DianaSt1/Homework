import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        double w = sc.nextDouble();

        System.out.print("Ваше число в двоичной системе: " + Integer.toBinaryString((int) w));

        sc.close();


    }

}
