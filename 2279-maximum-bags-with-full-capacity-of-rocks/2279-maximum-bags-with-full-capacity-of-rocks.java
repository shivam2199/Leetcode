class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        int add [] =new int [rocks.length];
        int i;
        for (i=0;i<rocks.length;i++){
            add[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(add);
        for (i=0; i< rocks.length; i++){
            if (additionalRocks>=add[i]){
                count++;
                additionalRocks -=add[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}