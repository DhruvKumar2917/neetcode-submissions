class Solution {

    public String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();

        for (String s : strs) {
            str.append(s.length());
            str.append('#');
            str.append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(str.substring(i, j));

            // Start of actual string
            int start = j + 1;

            // Extract string using length
            String s = str.substring(start, start + length);

            list.add(s);

            // Move to next encoded string
            i = start + length;
        }

        return list;
    }
}