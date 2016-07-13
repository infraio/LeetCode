
public class LinkedListCycle {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    System.out.println(hasCycle(l1));
    
    l1.next.next.next.next = l1.next;
    System.out.println(hasCycle(l1));
  }

  public static boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    
    ListNode slow = head;
    ListNode fast = head.next;
    
    while (fast != null && fast.next != null) {
      if (slow == fast) {
        return true;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    
    return false;
  }

}
