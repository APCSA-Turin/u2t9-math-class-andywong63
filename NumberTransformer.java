import java.util.Scanner;

public class NumberTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:\n> ");
        double number = scanner.nextDouble();
        scanner.close();

        double randomNumber = (int) (Math.random() * 50);
        number += randomNumber;
        System.out.println("Added " + randomNumber + " to number (New number: " + number + ")");

        number = Math.cbrt(number);
        System.out.println("Cube rooted number (New number: " + number + ")");

        number += Math.sin(number);
        System.out.println("Added sine of number to number (New number: " + number + ")");

        number = Math.ceil(number);
        System.out.println("Rounded number up (New number: " + number + ")");
    }
}