package reverse;

import java.util.Scanner;
public class SolutionReverse {
    public int reverseDigits(int n) {
        int result = 0;

        while(n > 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n = n / 10;
        }

        return result;
    }
}
class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SolutionReverse solution=new SolutionReverse();
        int n= sc.nextInt();
        System.out.println(solution.reverseDigits(n));
    }
}