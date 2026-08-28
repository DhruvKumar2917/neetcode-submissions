class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n2 < n1) return false;

        char[] str1 = s1.toCharArray();
            Arrays.sort(str1);
            String sorted1 = new String(str1);

        for(int i = 0; i <= n2-n1; i++) {
            String s = s2.substring(i,i + n1);
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            if(sorted1.equals(sorted)) return true;
        }

        return false;
    }
}
