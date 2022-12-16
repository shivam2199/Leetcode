class MyQueue {
    Stack <Integer> s1;
    Stack <Integer> s2;
    public MyQueue() {
        s1 = new Stack <>();
        s2 = new Stack <>();
    }
    
    public void push(int x) {
        if(s1.isEmpty()){
           s1.push(x);  // pushing in s1
           return;
       }        
        while(!s1.isEmpty()){
            s2.push(s1.pop()); // first Popping in s1 then pushing s1's pop value in s2
            // s1.pop();
        }
        s1.push(x);
        while(!s2.empty()){
            s1.push(s2.pop()); // first Popping in s2 then pusing s2's pop value in s1
            // s2.pop();
        }
    }
    
    public int pop() {
       return s1.pop();
    }
    
    public int peek() {
       return s1.peek();
    }
    
    public boolean empty() {
        if (s1.size() > 0)
            return false;
        else
            return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */