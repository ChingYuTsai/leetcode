public class SymmetricTree_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public boolean mySolution(TreeNode root) {
        if(root == null) return true;
        if(root != null && root.right == null && root.left == null) return true;
        if(root.left == null && root.right != null) return false;
        if(root.right == null && root.left != null) return false;
        if(root.left.val != root.right.val) return false;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left != null && right == null) return false;
        if(right != null && left == null) return false;
        if(left.val != right.val) return false;
        boolean res = helper(left.right, right.left);
        if(!res) return res;
        res = helper(left.left, right.right);
        return res;
    }
}
