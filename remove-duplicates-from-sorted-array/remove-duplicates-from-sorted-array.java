class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int count = 1;
        int i;
        for (i=1;i<nums.length;i++){
            if (nums[i] == curr){
                nums[i] = 101;
            }
            else{
                curr = nums[i];
                count++;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}