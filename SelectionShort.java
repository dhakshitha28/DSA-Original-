class SelectionShortSolution {
void selectionSort(int[] arr) {
    // code here
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }

    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}

public class SelectionShort{
    static void main(String[] args) {

        SelectionShortSolution selectionShortSolution=new SelectionShortSolution();
        int [] arr={20,3,6,9,1};
        selectionShortSolution.selectionSort(arr);




    }
}
