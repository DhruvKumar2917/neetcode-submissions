class Solution {

    bool comparison(TreeNode* node, TreeNode* subRoot){
        if(node == NULL || subRoot == NULL)
            return node == subRoot;

        if(node->val != subRoot->val)
            return false;

        return comparison(node->left, subRoot->left) &&
               comparison(node->right, subRoot->right);
    }

public:
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {

        if(root == NULL)
            return false;

        if(comparison(root, subRoot))
            return true;

        return isSubtree(root->left, subRoot) ||
               isSubtree(root->right, subRoot);
    }
};