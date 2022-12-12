class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> m = new HashMap <>();
        int i;
        int [] res = {-1,-1};
        for (i=0;i<nums.length; i++){
            m.put(nums[i], i);
        }
        for (i=0;i<nums.length;i++){
            if (m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i){
                res[0]=i;
                res[1] = m.get(target-nums[i]);
                break;
            }
        }
        return res;
    }
}