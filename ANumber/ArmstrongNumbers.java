package ANumber;

import java.util.Scanner;

class Solution {
    static boolean armstrongNumber(int n) {
        int duplicate = n;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }

        return duplicate == sum;
    }
}

public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (Solution.armstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }

        sc.close();
    }
}