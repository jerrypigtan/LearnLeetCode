package Test;

public class _0021_MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: list1 = [1,2,4], list2 = [1,3,4]
		// Output: [1,1,2,3,4,4]
		//  O(n + m)
		// Because exactly one of l1 and l2 is incremented on each loop iteration, the while loop runs for a number of iterations equal to the sum of the lengths of the two lists. All other work is constant, so the overall complexity is linear.
		// Space complexity : O(1)
		//The iterative approach only allocates a few pointers, so it has a constant overall memory footprint.
		ListNode result = mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
										new ListNode(1, new ListNode(3, new ListNode(4))));
		

		System.out.print(result.val);
	}
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode preHead = new ListNode(-1);
        ListNode cur = preHead;

        while((list1 != null) && (list2 != null)){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        if(list1 == null){
            cur.next = list2;
        }
        else{
            cur.next = list1;
        }

        return preHead.next;
    }
}
