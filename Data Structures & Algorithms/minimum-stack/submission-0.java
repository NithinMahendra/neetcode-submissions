class MinStack {
    Stack<Integer> s;
    Stack<Integer> m; 
    public MinStack() {
        m=new Stack<>();
        s=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(m.isEmpty())m.push(val);
        else{
            m.push(Math.min(val,m.peek()));
        }
    }
    
    public void pop() {
        s.pop();
        m.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}
