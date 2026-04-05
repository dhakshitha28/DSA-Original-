 class InsertionShortSolution {
     public void insertionSort(int arr[]) {
         // code here

         for(int i=1;i<arr.length;i++){

             int value=arr[i];
             int index =i-1;

             while(index>=0&&arr[index]>value){

                 arr[index+1]=arr[index];
                 index --;
             }

             arr[index+1]=value;
         }
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }

     }
}
public class InsertionShort{

    static void main(String[] args) {
        InsertionShortSolution i=new InsertionShortSolution();
        int []arr={14,9,15,12,6,8,13};
        i.insertionSort(arr);

    }

}