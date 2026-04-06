class RotateSolution {

    public void rotate(int[] arr) {
     int n = arr.length;
     int[] temp = new int[n];

     temp[0] = arr[n - 1];

     for (int i = 0; i < n - 1; i++) {
      temp[i + 1] = arr[i];
     }

     for (int i = 0; i < n; i++) {
      arr[i] = temp[i];
     }
    }
}

public class Rotate {
     public static void main(String[] args) {

      RotateSolution r = new RotateSolution();
      int[] arr = {1, 2, 3, 4, 5};

      r.rotate(arr);

      for(int i=0;i<arr.length;i++) {
       System.out.print(arr[i] + " ");
      }
 }
}