package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0102_levelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Input: root = [3,9,20,null,null,15,7]
		//		Output: [[3],[9,20],[15,7]]
		// ON Time
		// ON Space
		TreeNode input1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		List<List<Integer>> ans = levelOrder(input1);
		
		for(List<Integer> items : ans) 
		{
			for(int item : items) 
			{
				System.out.print(item);
			}
			System.out.println();
		}
		
	}
	 public static List<List<Integer>> levelOrder(TreeNode root) 
	 {
		 	int level = 0;
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        Queue<TreeNode> queueTreeNode = new LinkedList<TreeNode>();

	        if(root == null){
	            return ans;
	        }

	        queueTreeNode.offer(root);

	        while(!queueTreeNode.isEmpty()){
	            ans.add(new ArrayList<Integer>());

	            int queueCount = queueTreeNode.size();

	            for(int i = 0; i < queueCount; i++){
	                // returns and removes the element at the front end of the container.
	                TreeNode pollNode= queueTreeNode.poll();
	                
	                if(pollNode != null){
	                    ans.get(level).add(pollNode.val);
	                    // This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.
	                    if(pollNode.left != null){
	                        queueTreeNode.offer(pollNode.left);
	                    }

	                    if(pollNode.right != null){
	                        queueTreeNode.offer(pollNode.right);
	                    }
	                }
	            }

	            level ++;
	        }

	        return ans;
	 }
}
