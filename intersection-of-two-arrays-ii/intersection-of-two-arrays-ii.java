class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> m = new HashMap <>();
        ArrayList <Integer> r = new ArrayList<>();
        int i;
        int l1 = nums1.length;
        int l2 = nums2.length;
        for (i=0;i<l1;i++){
            if (m.containsKey(nums1[i])){
                m.put(nums1[i], m.get(nums1[i])+1);
            }
            else{
                m.put(nums1[i],1);
            }
        }
        for (i=0;i<l2;i++){
            if (m.containsKey(nums2[i]) && m.get(nums2[i])>0){
                r.add(nums2[i]);
                m.put(nums2[i], m.get(nums2[i])-1);
            }
        }
        int [] res = new int [r.size()];
        for (i=0; i<res.length; i++){
            res[i] = r.get(i);
        }
        return res;
    }
}