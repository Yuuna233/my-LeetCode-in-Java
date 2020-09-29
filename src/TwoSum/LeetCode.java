class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output={-1,-1};
        for(int n1=0; n1<nums.length; n1++){
            for(int n2=n1+1; n2<nums.length; n2++){
                if(nums[n1]+nums[n2]==target){
                    output[0]=n1;
                    output[1]=n2;
                }
            }
        }
        return output;
    }
}
