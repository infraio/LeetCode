
public class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
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
  
  public static ListNode deepCopy(ListNode old) {
    if (old == null) {
      return null;
    }
    ListNode n = new ListNode(old.val);
    ListNode oldIter = old.next;
    ListNode iter = n;
    while (oldIter != null) {
      iter.next = new ListNode(oldIter.val);
      iter = iter.next;
      oldIter = oldIter.next;
    }
    return n;
  }
}
