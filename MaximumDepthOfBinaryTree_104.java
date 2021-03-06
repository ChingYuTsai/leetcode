import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree_104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.right), maxDepth(root.left))+1;
    }
}
