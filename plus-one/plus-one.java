class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i;
        for (i=digits.length-1;i>=1; i--){
            int x = digits[i] + carry;
            if (x>=10){
                carry = 1;
                x = x%10;
            }
            else{
                carry=0;
            }
            digits[i] = x;
        }
        if (carry>0){
            digits[0] = digits[0] + carry;
        }
        if (digits[0] >= 10){
            digits[0] = digits[0]%10;
            int [] d = new int [digits.length+1];
            d[0]=1;
            for (i=0;i<digits.length;i++){
                d[i+1] = digits[i];
            }
            return d;
        }
        return digits;
    }
}