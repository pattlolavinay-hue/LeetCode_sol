class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {

    }
    
    public void push(int val) {
        st.push(val);
        if(!min.isEmpty()){
            int m = Math.min(val,min.peek());
            min.push(m);
        }else{
            min.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack stect will be instantiated and called as such:
 * MinStack st = new MinStack();
 * st.push(val);
 * st.pop();
 * int param_3 = st.top();
 * int param_4 = st.getMin();
 */