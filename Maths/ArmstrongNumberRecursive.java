package Maths;

import java.util.*;

public class ArmstrongNumberRecursive {

    // Recursive method to calculate sum of digits^power
    int calculateArmstrong(int d, int c) {
        if (d == 0) {
            return 0;
        }
        return (int) Math.pow(d % 10, c) + calculateArmstrong(d / 10, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Number of digits
        int digits = String.valueOf(n).length();

        ArmstrongNumberRecursive obj = new ArmstrongNumberRecursive();
        int result = obj.calculateArmstrong(n, digits);

        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        sc.close();
    }
}
