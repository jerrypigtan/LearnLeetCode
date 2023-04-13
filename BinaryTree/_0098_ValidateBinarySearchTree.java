package Test;

import java.util.Stack;

public class _0098_ValidateBinarySearchTree {

	public static void main(String[] args) {
//		boolean result = isValidBST(new TreeNode(2, 
//												new TreeNode(1, null, null), 
//												new TreeNode(5, null, null)));
//		
//		System.out.println(result);
		
		boolean result2 = isValidBST(new TreeNode(3, 
				new TreeNode(2, new TreeNode(1), null), 
				new TreeNode(5, null, null)));

System.out.println(result2);

	}
	public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(pre!=null && pre.val >= root.val) 
            {
            	return false;
            }
            
            pre = root;
            root = root.right;
        }

        return true;
    }
}
