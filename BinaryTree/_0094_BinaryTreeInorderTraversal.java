package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _0094_BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		List<Integer> results = inorderTraversal(
				new TreeNode(1, 
				new TreeNode(1194), 
				new TreeNode(2)));
		 
		 for(Integer res: results)
		 {
			// System.out.println(res);
		 }

	}
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
                // curr possible to null, then exit this while loop
            }
            
            curr = stack.pop();
            ans.add(curr.val);
            curr = curr.right;
        }

        return ans;
    }
}
