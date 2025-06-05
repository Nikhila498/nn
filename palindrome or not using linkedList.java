class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            if(fast != null)
                fast = fast.next;
        }

        ListNode rev = null;
        while(slow != null){
            ListNode temp = rev;
            rev = slow;
            slow = slow.next;
            rev.next = temp;
        }
        
        while(rev != null){
            if(rev.val != head.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }

        return true;  
    }
}