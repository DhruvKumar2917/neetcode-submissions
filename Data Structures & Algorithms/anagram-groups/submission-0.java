class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mpp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        int n = strs.length;

        for (int i = 0; i < n; i++) {

            char[] chars = strs[i].toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (!mpp.containsKey(key)) {
                mpp.put(key, new ArrayList<>());
            }

            mpp.get(key).add(strs[i]);
        }

        for (Map.Entry<String, List<String>> entry : mpp.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}