/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        HashSet<ListNode> s = new HashSet<>();
        while(a!=null){
            s.add(a);
            a = a.next;
        }
        ListNode b = headB;
        while(b!=null){
            if (s.contains(b)){
                return b;
            }
            b = b.next;
        }
        return null;
    }
}