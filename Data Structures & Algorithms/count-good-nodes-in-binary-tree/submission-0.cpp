/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
    public:
    int countGoodNodes(TreeNode* root, int maxi) {
        if(root == NULL) return 0;
        int cnt = 0;
        if(root->val >= maxi) cnt += 1;
        maxi = max(maxi, root->val);
        cnt += countGoodNodes(root->left, maxi);
        cnt += countGoodNodes(root->right, maxi);

        return cnt;
    }
public:
    int goodNodes(TreeNode* root) {

       
        int maxi = -1e9;

        return countGoodNodes(root, maxi);

        
        
    }
};
