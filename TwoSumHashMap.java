import java.util.HashMap;

public class TwoSumHashMap {
        public int[] twoSum(int[] numbers, int target) {

            int[] result ={-1,-1};
            HashMap<Integer,Integer> map=new HashMap <>();

            for(int i=0;i<numbers.length;i++){
                int ans=target-numbers[i];
                if(map.containsKey(ans)){
                    result[0]=map.get(ans);
                    result [1]=i+1;
                }
                else{
                    map.put(numbers[i],i+1);
                }
            }
            return result;
        }
}
