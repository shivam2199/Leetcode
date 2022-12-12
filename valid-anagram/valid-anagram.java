class Solution {
    public boolean isAnagram(String s, String t) {
         int [] a = new int [26];
        int i=0;
        for (i=0;i<26;i++){
            a[i]=0;
        }
        for (i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for (i=0;i<t.length();i++){
            a[t.charAt(i)-'a']--;
        }
        for (i=0;i<26;i++){
            if (a[i]!=0)
                return false;
        }
        return true;
    }
}