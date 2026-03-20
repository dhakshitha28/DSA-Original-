import java.util.Scanner;
class Solution {
    public int countDigits(int n) {
        int countDigit = 0;

        String value = String.valueOf(n);
        char ch[] = value.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(ch[0] == '0'){
                break;
            }
            else {
                countDigit++;
            }
        }

        return countDigit;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SolutionReverse solution=new SolutionReverse();
        int n= sc.nextInt();
        System.out.println(solution.countDigits(n));
    }
}
