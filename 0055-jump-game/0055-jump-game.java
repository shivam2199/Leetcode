class Solution {
    public boolean canJump(int[] nums) {
        int i, boundary =0;
        for (i=0; i<=boundary; i++){
            boundary = (int)Math.max(boundary, i+nums[i]);
            if (boundary >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}