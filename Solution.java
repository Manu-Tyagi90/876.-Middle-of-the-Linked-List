class ListNode {
int val;
ListNode next;
ListNode (int x) {
  val = x;
  }
ListNode (int x, ListNode y) {
  val = x;
  next = y;
  }
}

public class Solution {
  public static ListNode middle(ListNode l1) {
ListNode slow = l1;
ListNode fast = l1;
  while(fast!=null && fast.next!=null) {
    slow = slow.next;
    fast = fast.next.next;  
  }
  return slow;
}

public static void main(String[] manu) {
  ListNode l1 = new ListNode (1, new ListNode(2, new ListNode(3,new ListNode (4, new ListNode (5,null)))));
  ListNode res = middle(l1);
  while(res!=null) {
  System.out.print(res.val + " ");  
  res = res.next;
}
}
}
