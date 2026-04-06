 class SecondLargestNumberSolution{

  public int getSecondLargest(int[] arr) {
   // code here
   int max=arr[0];

   for(int i=1;i<arr.length;i++){

    if(max<arr[i]){
     max=arr[i];

    }

   }

   for(int i=0;i<arr.length;i++){
    if(arr[i]==max){
     arr[i]=0;
    }
   }

   int secondMax=arr[0];
   for(int i=1;i<arr.length;i++){

    if(secondMax<arr[i]){
     secondMax=arr[i];

    }

   }

   if(secondMax==0){
    secondMax=-1;
   }

   return secondMax;

  }
}
 public class SecondLargestNumber{
  static void main(String[] args) {

     SecondLargestNumberSolution s=new SecondLargestNumberSolution();
      int [] arr={20,24,1,5,28};
   System.out.println(s.getSecondLargest(arr));

  }
 }
