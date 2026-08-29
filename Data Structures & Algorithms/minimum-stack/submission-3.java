class MinStack {

    Stack<Long> st;
    long mini;

    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;
        
    }
    
    public void push(int val) {
        long value = val;
        if(st.isEmpty()) {
            st.push(value);
            mini = value;
        }
        else if(mini > value){
            st.push(2 * value - mini);
            mini = value;
        }
        else st.push(value);    
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        long temp = st.peek();
        st.pop();

        if(mini > temp){
            mini = 2 * mini - temp;
        }


        
    }
    
    public int top() {
        long temp = st.peek();
        if(mini > temp) return (int)mini;
        else return (int)temp;


           
    }
    
    public int getMin() {
        return (int)mini;
        
    }
}
