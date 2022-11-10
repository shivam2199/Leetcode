class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String r = "";
        String r2 = ""; 
        int i;
        int l = s.length();
        for (i=0;i<l;i++){
            char ch = s.charAt(i);
            if ((ch>=97 && ch<=122) || (ch>=48 && ch<=57)){
                r = r+ch;
                r2 = ch+r2;
            }
        }
        return r.equals(r2);
    }
}