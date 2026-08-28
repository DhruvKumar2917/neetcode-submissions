class Solution {
    public boolean isPalindrome(String s) {
        int n1 = s.length();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n1; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) <= 'z' && s.charAt(i) >= 'A'
                || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                    str.append(Character.toLowerCase(s.charAt(i)));
                } else
                    str.append(s.charAt(i));
            }
        }

        int n2 = str.length();

        int j = n2 - 1;
        int i = 0;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
        
    }
}
