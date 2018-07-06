//6.11����������л������л�������
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
			return "#!"; //Ϊ�շ���#
		}
		String ser = head.value+"!";
		ser+=serialTree(head.left);
		ser+=serialTree(head.right);
		return ser;
	}
	
	public static Node recon(String ser) {
		String[] values = ser.split("!");  //��split�ָ��Ϊ���飬�������
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
		Node head = new Node(Integer.valueOf(value)); //Integer.valueOf����һ����ʾָ����valueֵ��integerʵ��
		head.left = reconPreOrder(queue); //����������
		head.right = reconPreOrder(queue);//����������
		return head; //����ͷ���
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(5);
		head.left= new Node(4);
		head.right = new Node(3);
		head.left.left=new Node(2);
		System.out.println(serialTree(head)); //���л����ַ���
		
		System.out.println(recon(serialTree(head)).left.value);
		System.out.println(recon(serialTree(head)).right.value);
		System.out.println(recon(serialTree(head)).left.left.value);
		//System.out.println(recon(serialTree(head)).left.right.value);
	}

}
