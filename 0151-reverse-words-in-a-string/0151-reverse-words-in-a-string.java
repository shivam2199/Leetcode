class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String r ="";
        int  l = s.length();
        String [] a  = s.split(" ");
        int i;
        for (i=a.length-1;i>=0;i--){
            if (!a[i].equals("")){
                r = r + a[i]+" ";
            }
            
        }
        r = r.trim();
        return r;
    }
}