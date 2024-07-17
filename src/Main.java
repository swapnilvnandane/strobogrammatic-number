import com.app.StrobogrammaticNumber;

import java.util.Scanner;

/**
 * Main class.
 *
 * **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is strobogrammatic or not: ");

        String number = sc.nextLine();

        if (StrobogrammaticNumber.check(number)) {
            System.out.println("The number is strobogrammatic.");
        } else {
            System.out.println("The number is not strobogrammatic.");
        }
    }
}