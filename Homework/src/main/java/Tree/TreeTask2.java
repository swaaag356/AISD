package Tree;

public class TreeTask2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(treeToLine(root));
    }

    public static String treeToLine(TreeNode node) {
        if (node == null) return "NULL";

        return "(" + node.value + ", " + treeToLine(node.left) + ", " + treeToLine(node.right) + ")";
    }
}
