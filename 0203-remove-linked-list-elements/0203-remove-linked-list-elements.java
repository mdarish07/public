/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
  while(head != null && head.val == val) { // for duplicate val present in LL
            head = head.next;
        }
    ListNode prev = head;
    ListNode temp = head;
  while(temp != null) {
           if(temp != null && temp.val == val)
            prev.next=temp.next;
        else
  prev = temp;
  temp = temp.next;
    }
    return head;
        }
}