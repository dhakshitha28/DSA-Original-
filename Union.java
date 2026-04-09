import java.util.*;

class UnionSolution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> result = new ArrayList<>();

        int n1 = a.length;
        int n2 = b.length;

        int i = 0, j = 0;

        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(!result.contains(a[i])){
                    result.add(a[i]);
                }
                i++;
            } else {
                if(!result.contains(b[j])){
                    result.add(b[j]);
                }
                j++;
            }
        }

        while(i < n1){
            if(!result.contains(a[i])){
                result.add(a[i]);
            }
            i++;
        }

        while(j < n2){
            if(!result.contains(b[j])){
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
}

public class Union {
    static void main(String[] args) {
        int [] a={1,2,4,3,6};
        int [] b={7,4,7,1,2,3,4};
        UnionSolution u=new UnionSolution();
        ArrayList<Integer>value=u.findUnion(a,b);

        for (int i=0 ;i<value.size();i++){
            System.out.print(value.get(i)+" ");
        }
    }
}