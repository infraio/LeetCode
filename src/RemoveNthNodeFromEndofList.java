
public class RemoveNthNodeFromEndofList {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);
    l1.next.next.next = new ListNode(4);
    l1.next.next.next.next = new ListNode(5);
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), 0));
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), 1));
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), 2));
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), 3));
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), 4));
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), 5));
    System.out.println(removeNthFromEnd(ListNode.deepCopy(l1), -1));
  }
  
  public static ListNode removeNthFromEnd(ListNode head, int n) {
    if (n <= 0) {
      return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = first;
    while (n >= 0 && second != null) {
      second = second.next;
      n--;
    }
    while (second != null) {
      first = first.next;
      second = second.next;
    }
    first.next = first.next.next;
    return dummy.next;
  }

}
