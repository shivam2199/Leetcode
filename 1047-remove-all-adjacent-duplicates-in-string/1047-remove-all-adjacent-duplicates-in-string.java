class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(stack.isEmpty() || stack.peek() != ch) stack.add(ch);
            else stack.pop();
        }
        char[] arr = new char[stack.size()];
        for(int i=stack.size(); i>0; i--) arr[i-1] = stack.pop();
        return new String(arr);
            
        
    }
}