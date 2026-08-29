class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();

        int left = 0;
        int right = 0;
        int mmf = 0;
        int maxi = 0;

        while (right < n) {
            // if(!mpp.containsKey(s.charAt(right))) mpp.put(s.charAt(right),1);
            // else mpp.put(s.charAt(right),mpp.get(s.charAt(right) + 1));

            // mmf = Math.max(mmf,mpp.get(s.charAt(right)));
            char ch = s.charAt(right);

            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);

            mmf = Math.max(mmf, mpp.get(ch));
            int len = right - left + 1;

            while (len - mmf > k && left < right) {
                mpp.put(s.charAt(left), mpp.get(s.charAt(left)) - 1);
                left++;
                len = right - left + 1;
            }

            maxi = Math.max(maxi, right - left + 1);
            right++;
        }

        return maxi;
    }
}
