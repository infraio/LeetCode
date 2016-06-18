
public class AddTwoNumbers {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    
    ListNode result = addTwoNumbers(l1, l2);
    System.out.println(result);
    
    l1 = new ListNode(5);
    l2 = new ListNode(5);
    result = addTwoNumbers(l1, l2);
    System.out.println(result);
    
    l1 = new ListNode(1);
    l1.next = new ListNode(9);
    l1.next.next = new ListNode(9);
    l2 = new ListNode(9);
    result = addTwoNumbers(l1, l2);
    System.out.println(result);
  }
  
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    
    ListNode iter = result;
    int more = 0;
    while (l1 != null || l2 != null) {
      int sum = 0;
      sum += l1 == null ? 0 : l1.val;
      sum += l2 == null ? 0 : l2.val;
      sum += more;
      iter.next = new ListNode(sum % 10);
      more = sum / 10;
      iter = iter.next;
      l1 = l1 == null ? null : l1.next;
      l2 = l2 == null ? null : l2.next;
    }
    if (more != 0) {
      iter.next = new ListNode(more);
    }
    
    return result.next;
  }

}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
  
  @Override
  public String toString() {
    String s = String.valueOf(val);
    ListNode iter = next;
    while (iter != null) {
      s += " -> ";
      s += String.valueOf(iter.val);
      iter = iter.next;
    }
    return s;
  }
}
