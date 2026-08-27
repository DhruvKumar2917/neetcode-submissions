public class Codec {

    public String serialize(TreeNode root) {

        if (root == null) return "";

        StringBuilder str = new StringBuilder();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();

            if (temp == null) {
                str.append("#,");
            } else {
                str.append(temp.val).append(",");

                q.offer(temp.left);
                q.offer(temp.right);
            }
        }

        return str.toString();
    }

    public TreeNode deserialize(String data) {

        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] values = data.split(",");

        TreeNode root =
            new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < values.length) {

            TreeNode temp = q.poll();

            // Left
            if (values[i].equals("#")) {
                temp.left = null;
            } else {
                temp.left =
                    new TreeNode(Integer.parseInt(values[i]));

                q.offer(temp.left);
            }

            i++;

            
            if (i < values.length) {

                if (values[i].equals("#")) {
                    temp.right = null;
                } else {
                    temp.right =
                        new TreeNode(Integer.parseInt(values[i]));

                    q.offer(temp.right);
                }

                i++;
            }
        }

        return root;
    }
}