class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        int n = tokens.length;
        

        for(int i = 0; i < n; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") ||
            tokens[i].equals("*") || tokens[i].equals("/")){
                int t1 = st.peek();
                st.pop();
                int t2 = st.peek();
                st.pop();
                if(tokens[i].equals("+")) st.push(t2 + t1);
                else if(tokens[i].equals("*")) st.push(t2 * t1);
                else if(tokens[i].equals("/")) st.push(t2 / t1);
                else if(tokens[i].equals("-")) st.push(t2 - t1);
                
            }
            else st.push(Integer.parseInt(tokens[i]));
        }

        return st.peek();
        
    }
}
