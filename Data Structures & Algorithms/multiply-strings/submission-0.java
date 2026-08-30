class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n1 = num1.length();
        int n2 = num2.length();

        int[] str = new int[n1 + n2];
        for (int i = 0; i < n1 + n2; i++) str[i] = 0;

        String str1 = new StringBuilder(num1).reverse().toString();
        String str2 = new StringBuilder(num2).reverse().toString();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                int digit = (str1.charAt(i) - '0') * (str2.charAt(j) - '0');

                str[i + j] += digit;
                str[i + j + 1] += (str[i + j] / 10);
                str[i + j] = str[i + j] % 10;
            }
        }
        

        StringBuilder ans = new StringBuilder();

        int k = n1 + n2 - 1;

        while (k > 0 && str[k] == 0) {
            k--;
        }

        // Build from most significant digit to least significant
        while (k >= 0) {
            ans.append(str[k]);
            k--;
        }

        return ans.toString();

        
    }
}
