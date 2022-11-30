class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        HashSet <Integer> h = new HashSet<>();
        int i;
        for (i=0; i<arr.length;i++){
            if (m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }
            else{
                m.put(arr[i], 1);
            }
        }
        for (Integer k : m.keySet()){
            if (h.contains(m.get(k))){
                return false;
            }
            else{
                h.add(m.get(k));
            }
        }
        return true;
    }
}