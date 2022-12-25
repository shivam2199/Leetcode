//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int l = S.length();
        int a[] = new int [l];
        HashMap <Character, Integer> m = new HashMap <>();
        int i;
        for (i=0;i<l;i++){
            char ch = S.charAt(i);
            if (m.containsKey(ch)){
                a[m.get(ch)] = -1;
            }
            else{
                m.put(ch, i);
                a[i] = 1;
            }
        }
        for (i=0; i<l; i++){
            if (a[i] == 1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}

