import java.util.Scanner;

class MissingArraySolution {
    int missingNum(int arr[]) {
        for (int i = 1; i <= arr.length + 1; i++) {
            boolean theValueIsNotAvailable = true;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    theValueIsNotAvailable = false;
                    break;
                }
            }

            if (theValueIsNotAvailable) {
                return i;
            }
        }
        return -1;
    }
}

public class MissingArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MissingArraySolution obj = new MissingArraySolution();
        int result = obj.missingNum(arr);

        System.out.println("Missing number: " + result);
    }
}
