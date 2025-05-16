package Tree;

import java.util.ArrayList;

public class TreeTask3 {
    public static void main(String[] args) {
        NTreeNode root = new NTreeNode(1);
        root.childs.add(new NTreeNode(2));
        root.childs.add(new NTreeNode(3));
        root.childs.add(new NTreeNode(4));

        root.childs.get(0).childs.add(new NTreeNode(5));
        root.childs.get(2).childs.add(new NTreeNode(6));
        root.childs.get(2).childs.add(new NTreeNode(7));

        System.out.println(printTree(root));
    }

    public static String printTree(NTreeNode node) {
        if (node == null) return "NULL";

        StringBuilder sb = new StringBuilder();
        sb.append("(").append(node.value);

        if (node.childs.isEmpty()) {
            sb.append(", NULL");
        } else {
            for (NTreeNode element: node.childs) {
                sb.append(", ").append(printTree(element));
            }
        }

        sb.append(")");
        return sb.toString();
    }
}
