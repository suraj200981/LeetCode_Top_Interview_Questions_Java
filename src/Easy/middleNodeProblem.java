package Easy;

import java.util.ArrayList;
import java.util.List;

public class middleNodeProblem {

  public ListNode middleNode(ListNode head) {

    ArrayList<ListNode> ar = new ArrayList<ListNode>();

    ListNode n = head;
    int count=0;
    while (n != null) { //keep looping until the node is null
      ar.add(n);
      count++;
      n = n.next; //will get the next node
    }

    if(count % 2 ==0 ){
      count= count/2;
    }else if(count % 2 ==1){
      count= (count/2)+1;
    }

    return ar.get(count);
  }
}
