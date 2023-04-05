package Test;

import java.util.Stack;

public class _0938_RangeSumBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
		//  Output: 32
		//  Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
	
		//	Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
		//	Output: 23
		//	Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
		

		
		//		What is Binary Search Tree?
		//		Binary Search Tree is a node-based binary tree data structure which has the following properties:
		//
		//		The left subtree of a node contains only nodes with keys lesser than the node’s key.
		//		The right subtree of a node contains only nodes with keys greater than the node’s key.
		//		The left and right subtree each must also be a binary search tree.
		TreeNode input = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18)));
		
		int ans = rangeSumBST(input, 7, 15);
		System.out.println(ans);
	}
	
	// Time Complexity: O(N), where N is the number of nodes in the tree.

	// Space Complexity: O(N)
	public static int rangeSumBST(TreeNode root, int low, int high) {
	        Stack<TreeNode> stackTree = new Stack<>();
	        int ans = 0;
	        stackTree.push(root);
	        while(!stackTree.isEmpty()){

	            TreeNode node = stackTree.pop();

	            if(node == null){
	                continue;
	            }
	            int value = node.val;
	            if(value < low){
	                stackTree.push(node.right);
	            }
	            else if(value > high){
	                stackTree.push(node.left);
	            }
	            else{
	                stackTree.push(node.right);
	                stackTree.push(node.left);
	                ans += value;
	            }
	        }

	        return ans;
	    }

}
