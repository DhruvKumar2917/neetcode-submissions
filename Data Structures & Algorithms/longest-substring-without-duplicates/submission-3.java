class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> mpp = new HashMap<>();

        int i = 0;
        int j = 0;
        int n = s.length();
        if(n == 0) return 0;
        int len = 1;

        while (j < n) {

            if(mpp.containsKey(s.charAt(j))){
               
                if(mpp.get(s.charAt(j)) >= i){
                    i = mpp.get(s.charAt(j)) + 1;
                    // mpp.put(s.charAt(j),j);
                }
                
            }
            len = Math.max(len, j - i + 1);
            mpp.put(s.charAt(j),j);
            j++;
            


        }

        return len;

        
    }
}
