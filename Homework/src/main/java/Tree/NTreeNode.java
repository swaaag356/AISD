package Tree;

import java.util.ArrayList;
import java.util.List;

public class NTreeNode {
    int value;
    List<NTreeNode> childs;


    public NTreeNode(int value){
        this.value = value;
        this.childs = new ArrayList<>();
    }
}
