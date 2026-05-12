class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
    private boolean isSameTree(TreeNode root, TreeNode subTree){
        if (root == null && subTree == null){
            return true;
        }
        if (root != null && subTree != null && root.val == subTree.val){
            return isSameTree(root.left, subTree.left) && isSameTree(root.right, subTree.right);
        }
        return false;
    }
}