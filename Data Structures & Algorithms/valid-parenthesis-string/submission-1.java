class Solution {
    // boolean validParenthesisChecker(int ind, String s, int count, int n) {
    //     if(count < 0) return false;
    //     if(ind == n) return count == 0;

    //     if(s.charAt(ind) == '(') return validParenthesisChecker(ind + 1, s, count + 1, n);
    //     else if(s.charAt(ind) == ')') return validParenthesisChecker(ind + 1, s, count - 1, n);

    //     else {
    //         return validParenthesisChecker(ind + 1, s, count, n ) ||
    //         validParenthesisChecker(ind + 1, s, count + 1, n) ||
    //         validParenthesisChecker(ind + 1, s, count - 1, n);
    //     }
    // }

    boolean validParenthesisChecker(String s){
        int mini = 0;
        int maxi = 0;

        int n = s.length();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(') {
                mini = mini + 1;
                maxi = maxi + 1;
            }
            else if(s.charAt(i) == ')'){
                mini = mini - 1;
                maxi = maxi - 1;
            }
            else{
                mini = mini - 1;
                maxi = maxi + 1;

            }
            if(mini < 0) mini = 0;
            if(maxi < 0) return false;

        }
        return mini == 0;
    }

    public boolean checkValidString(String s) {
        //int n = s.length();

        return validParenthesisChecker(s);
        
    }
}
