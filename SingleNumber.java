import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
        public int singleNumber(int[] nums) {

            Map<Integer,Integer> map=new HashMap<>();
            int result=0;

            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])==1){
                    result=nums[i];
                    break;
                }
            }

            return result;
        }
}

