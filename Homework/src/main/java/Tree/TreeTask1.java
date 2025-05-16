package Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeTask1 {
    static Map<TreeNode,Integer> heights = new HashMap<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        height(root);

        printMap(heights);
    }

    public static int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        int height = 1 + Math.max(left, right);

        heights.put(node, height);

        return height;
    }

    public static void printMap(Map<TreeNode, Integer> heights) {
        heights.entrySet().stream().forEach(e -> System.out.println(e.getKey().value + " " + e.getValue()));
    }
}
