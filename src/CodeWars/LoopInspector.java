package CodeWars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangweimin on 16/5/12.
 */
public class LoopInspector {
    public int loopSize(Node node) {
        List<Node> nodes = new ArrayList<>();
        int i = 0;
        while (node.getNext() != null){
            if(!nodes.contains(node.getNext())) {
                nodes.add(node.getNext());
                node = node.getNext();
                i++;
            }else{
                i = i - nodes.indexOf(node.getNext());
                break;
            }
        }
        return i;
    }
}
