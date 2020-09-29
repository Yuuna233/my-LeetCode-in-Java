class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 1;
        for (; right < nums.length; right++) {
            if (nums[left] == nums[right]) {
                continue;
            }
            left++;
            nums[left] = nums[right];
        }
        return left + 1;
    }
}