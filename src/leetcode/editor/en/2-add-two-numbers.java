package leetcode.editor.en;
// You are given two non-empty linked lists representing two non-negative integer
// s. The digits are stored in reverse order and each of their nodes contain a sing
// le digit. Add the two numbers and return it as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the nu
// mber 0 itself.
//
// Example:
//
//
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.
//
// Related Topics Linked List Math

// leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
//class Solution {
class addTwoNumbersSolution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;




    ListNode sumList = new ListNode(0);
    ListNode templist = sumList;
    int carry = 0, value = 0;

    while (l1 != null && l2 != null) {
      value = (l1.val + l2.val + carry ) % 10;
      carry = (l1.val + l2.val + carry ) / 10;

      templist.next = new ListNode(value);
      l1 = l1.next;
      l2 = l2.next;
      templist = templist.next;
      if ((l1 == null || l2 == null) && carry != 0) {
        if (l1 == null){
          l1 = new ListNode(carry);
          carry = 0;
        } else {
          l2 = new ListNode(carry);
          carry = 0;
        }

      }
    }
    if (l1 != null){
      templist.next = l1;
    }
    if (l2 != null){
      templist.next = l2;
    }
    return sumList.next;
  }
}


// leetcode submit region end(Prohibit modification and deletion)


class Main{
  public static void main(String[] args) {
    int i = 5;

    ListNode l1 = new ListNode(5);
    ListNode l2 = new ListNode(5);
    ListNode head1 = l1;
    ListNode head2 = l2;

    while (i > 0) {
      l1 = addNode(l1);
      l2 = addNode(l2);
      i -= 1;
    }

    addTwoNumbersSolution s = new addTwoNumbersSolution();
    s.addTwoNumbers(head1, head2);

  }

  static ListNode addNode(ListNode head) {
    int v = (int) (Math.random() * 10);
    head.next = new ListNode(v);
    return head.next;
  }
}
