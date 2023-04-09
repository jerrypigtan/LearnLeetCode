package Test;

public class _0206_reverseList_Iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode result = reverseList(new ListNode(1, new ListNode(2, new ListNode(3))));

	}
	public static ListNode reverseList(ListNode head) {
		// last node always is null
        ListNode resultNode = null;
        ListNode currentNode = head;
        
        while (currentNode != null) 
        {
            ListNode nextNode= currentNode.next;
            currentNode.next = resultNode;
            
            resultNode = currentNode;
            currentNode = nextNode;
        }
        
        return resultNode;
    }
}
