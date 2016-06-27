
public class SwapNodesInPairs {

  public static void main(String[] args) {
    ListNode n = new ListNode(1);
    n.next = new ListNode(2);
    n.next.next = new ListNode(3);
    n.next.next.next = new ListNode(4);
    System.out.println(swapPairs(n));
    
    n = new ListNode(1);
    n.next = new ListNode(2);
    n.next.next = new ListNode(3);
    System.out.println(swapPairs(n));
    
    n = new ListNode(1);
    System.out.println(swapPairs(n));
  }

  public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode dummy = new ListNode(-1);
    ListNode i = head, j = head.next, cur = dummy;
    while (i != null && j != null) {
      i.next = j.next;
      j.next = i;
      cur.next = j;
      cur = i;
      i = cur.next;
      if (i == null) break;
      j = i.next;
    }
    return dummy.next;
  }

}
