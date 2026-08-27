class Solution {

    void parenthesisGenerator(int open, int close,int n, StringBuilder str,List<String> ans) {
        if(open + close == 2*n){
            ans.add(str.toString());
        }

        if(open < n){
            str.append('(');
            parenthesisGenerator(open + 1, close, n, str,ans);
            str.deleteCharAt(str.length() - 1);

        }
        if(close < open){
            str.append(')');
            parenthesisGenerator(open, close + 1, n, str,ans);
            str.deleteCharAt(str.length() - 1);

        }
    }

    


    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        parenthesisGenerator(0,0,n,str,ans);
        return ans;

        
    }
}
