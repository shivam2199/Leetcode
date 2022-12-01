class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "AEIOUaeiou";
        int l =s.length();
        int c1=0,c2=0,i;
        for (i=0;i<l/2;i++){
            if (vowels.indexOf(s.charAt(i))>-1){
                c1++;
            }
        }
        for (i=l/2;i<l;i++){
            if (vowels.indexOf(s.charAt(i))>-1){
                c2++;
            }
        }
        if (c1==c2)
            return true;
        else
            return false;
        
    }
}