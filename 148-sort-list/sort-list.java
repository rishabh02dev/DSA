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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int arr[] = new int[count];

        int i =0;
        temp = head;
        while(temp!=null && i<arr.length){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        Arrays.sort(arr);

        temp = head;
        i = 0;
        while(temp!=null && i<arr.length){
            temp.val = arr[i];
            temp = temp.next;
            i++;
        }

        return head;
    }
}