class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        int i;
        for (i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[p++] = nums[i];
            }
        }
        for (i=p;i<nums.length; i++){
            nums[i] =0;
        }
    }
}