class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int mj = -1;
        int count;
        for(int i=0; i<n; i++){
            count = 0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
                if(count> n/2){
                    mj = nums[i];
                    break;
                }
        }
         return mj;
    }
}
