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
    public void printList (ListNode n){
        ListNode c = n;
        while (c!= n){
            System.out.print(c.val +" ");
            c = c.next;
        }
        System.out.println();
    }
    public ListNode oddEvenList(ListNode head) {
        if(head ==null){
            return head;
            }
        ListNode evenHead = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while(even !=null && odd !=null && odd.next !=null && even.next !=null) {
        odd.next = even.next;
        odd=odd.next;
        even.next = odd.next;
        even = even.next;
        }
        odd.next=evenHead;
        return head;
    }
}