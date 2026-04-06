import java.util.ArrayList;

class RemoveSolution {
 public ArrayList<Integer> removeDuplicates(int[] arr) {
  ArrayList<Integer> result = new ArrayList<>();

  for (int i = 0; i < arr.length; i++) {
   if (!result.contains(arr[i])) {
    result.add(arr[i]);
   }
  }

  return result;
 }
}

public class Remove {
 public static void main(String[] args) {
  RemoveSolution r = new RemoveSolution();

  int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3};

  ArrayList<Integer> output = r.removeDuplicates(arr);

  System.out.println(output);
 }
}