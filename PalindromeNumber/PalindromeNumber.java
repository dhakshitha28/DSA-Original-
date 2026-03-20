package PalindromeNumber;

import reverse.SolutionReverse;

import java.util.Scanner;

class SolutionPalindrome {
    public boolean isPalindrome(int n) {

        String value = String.valueOf(n);
        char ch[] = value.toCharArray();
        String resultString = "";

        for(int i = ch.length - 1; i >= 0; i--){
            resultString += ch[i];
        }

        return value.equals(resultString);
    }
}

class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SolutionPalindrome solution=new SolutionPalindrome();
        int n= sc.nextInt();
        System.out.println(solution.isPalindrome(n));
    }
}