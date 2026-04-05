class BubbleShortSolution {

    public void bubbleSort(int[] arr) {
        // code here
        // set the end part of the array
        for(int i=arr.length-1;i>=1;i--){
            //starting part of the array
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
public class BubbleShort{
    static void main(String[] args) {

        BubbleShortSolution b=new BubbleShortSolution();
        int [] arr={20,3,6,9,1};
        b.bubbleSort(arr);
    }
}
