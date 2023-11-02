package SwapNodesInPairs;

public class Main {
	public static void main(String []args) {
		
		ListNode head=new ListNode(1);

		ListNode secondNode= new ListNode(2);
		head.next=secondNode;
		
		ListNode thirdNode=new ListNode(3);
		secondNode.next=thirdNode;
		
		ListNode fourthNode=new ListNode(4);
		thirdNode.next=fourthNode;
		
		Solution example=new Solution();
	    ListNode newHead = example.swapPairs(head);
	    printLinkedList(newHead);
	    
	
	}
	public static void printLinkedList(ListNode head) {
	    ListNode current = head;
	    while (current != null) {
	        System.out.print(current.val + " -> ");
	        current = current.next;
	    }
	}

}
