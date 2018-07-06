//6.11先序遍历序列化反序列化二叉树
package class_5_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class C2_SerialReconstructTree {
	public static class Node{
		public int value;
		public Node left;
		public Node right;
		public Node(int value) {
			this.value = value;
		}
	}

	public static String serialTree(Node head) {
		if(head==null) {
			return "#!"; //为空返回#
		}
		String ser = head.value+"!";
		ser+=serialTree(head.left);
		ser+=serialTree(head.right);
		return ser;
	}
	
	public static Node recon(String ser) {
		String[] values = ser.split("!");  //用split分割变为数组，送入队列
		Queue<String> queue = new LinkedList<String>();
		for (int i = 0; i != values.length; i++) {
			queue.offer(values[i]);
		}
		return reconPreOrder(queue);
	}
	public static Node reconPreOrder(Queue<String> queue) {
		String value = queue.poll();
		if (value.equals("#")) {
			return null;
		}
		Node head = new Node(Integer.valueOf(value)); //Integer.valueOf返回一个表示指定的value值的integer实例
		head.left = reconPreOrder(queue); //建立左子树
		head.right = reconPreOrder(queue);//建立右子树
		return head; //返回头结点
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(5);
		head.left= new Node(4);
		head.right = new Node(3);
		head.left.left=new Node(2);
		System.out.println(serialTree(head)); //序列化的字符串
		
		System.out.println(recon(serialTree(head)).left.value);
		System.out.println(recon(serialTree(head)).right.value);
		System.out.println(recon(serialTree(head)).left.left.value);
		//System.out.println(recon(serialTree(head)).left.right.value);
	}

}
