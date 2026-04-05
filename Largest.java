class LargestSolution{

    public static int largest(int[] arr) {
        // code here
        int result =arr[0];
        for(int i=1;i<arr.length;i++){
            if(result < arr[i]){
                result=arr[i];
            }
        }
        return result;
    }
}
public class Largest {
    static void main(String[] args) {
        LargestSolution l=new LargestSolution();
        int [] arr={20,24,1,5,28};
        System.out.println(l.largest(arr));

    }
}