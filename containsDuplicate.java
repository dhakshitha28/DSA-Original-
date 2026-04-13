public class containsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            int max=nums[0];
            for(int i=1;i<nums.length;i++){
                if(max<nums[i]){
                    max=nums[i];
                }
            }
            int [] arr=new int[max+1];

            for(int i=0;i<nums.length;i++){
                int value=nums[i];
                arr[value]=arr[value]+1;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]==2){
                    return true;
                }
            }

            return false;
        }
    }

