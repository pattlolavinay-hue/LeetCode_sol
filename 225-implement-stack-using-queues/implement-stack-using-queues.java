class MyStack {
    Queue<Integer> que1 = new ArrayDeque<>();
    Queue<Integer> que2 = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        que1.offer(x);
    }
    
    public int pop() {
        while(que1.size()>1){
            que2.offer(que1.poll());
        }
        int k = que1.poll();
        while(!que2.isEmpty()){
            que1.offer(que2.poll());
        }
        que2.clear();
        return k;
    }
    
    public int top() {
        while(que1.size()>1){
            que2.offer(que1.poll());
        }
        int k = que1.peek();
        que2.offer(que1.poll());
        while(!que2.isEmpty()){
            que1.offer(que2.poll());
        }
        que2.clear();
        return k;
    }
    
    public boolean empty() {
        return que1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */