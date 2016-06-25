
public class MergeTwoSortedLists {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(6);
    
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(5);
    l2.next.next = new ListNode(9);
    l2.next.next.next = new ListNode(10);
    
    ListNode l3 = null;
    ListNode l4 = new ListNode(0);
    
    System.out.println(mergeTwoLists(ListNode.deepCopy(l1), ListNode.deepCopy(l1)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l1), ListNode.deepCopy(l2)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l1), ListNode.deepCopy(l3)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l1), ListNode.deepCopy(l4)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l2), ListNode.deepCopy(l2)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l2), ListNode.deepCopy(l3)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l2), ListNode.deepCopy(l4)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l3), ListNode.deepCopy(l3)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l3), ListNode.deepCopy(l4)));
    System.out.println(mergeTwoLists(ListNode.deepCopy(l4), ListNode.deepCopy(l4)));
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode now = dummy;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        now.next = l1;
        l1 = l1.next;
      } else {
        now.next = l2;
        l2 = l2.next;
      }
      now = now.next;
    }
    if (l1 != null) {
      now.next = l1;
    }
    if (l2 != null) {
      now.next = l2;
    }
    return dummy.next;
  }
}
