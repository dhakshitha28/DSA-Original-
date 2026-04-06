class ArrayIsSortedSolution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean result =true;
        int n=arr.length-1;
        for(int i=0;i<n-1;i++){

            if(arr[i]>arr[i+1]){

                result=false;
                break;

            }
        }

        return result;
    }
}
public class ArrayIsSorted{
    static void main(String[] args) {
        ArrayIsSortedSolution a=new ArrayIsSortedSolution();
        int [] arr1={10,20,30,40,50};
        System.out.println(a.isSorted(arr1));
        int [] arr2={28,10,24,6385,36,96,36};
        System.out.println(a.isSorted(arr2));

    }
}
