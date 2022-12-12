class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length<=1 || k%nums.length==0)
            return;
        k = k%nums.length;
        int i, m=0;
        int res [] =new int [nums.length];
        for (i=nums.length-k;i<nums.length;i++){
            res[m++] = nums[i];
        }
        for (i=0;i<nums.length-k;i++){
            res[m++]=nums[i];
        }
        for (i=0;i<nums.length;i++){
            nums[i] = res[i];
        }
        
    }
}