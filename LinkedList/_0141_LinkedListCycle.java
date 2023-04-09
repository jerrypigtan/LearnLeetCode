package Test;

public class _0141_LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode slow = head;
        // possible is null, so no issue, cos we already head == null before then return false.
        ListNode fast = head.next;

        while(slow != fast){
        	// need to check, if fast is null then no cycle, and also fast.next is null 
        	// fast.next need to check because we want to use fast.next.next later.
            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
