//给定两个有序链表的头指针head1和head2， 打印两个链表的公共部分/相等节点
//外排的方式，移动头部
package class_3_List;

public class C3_PrintCommonNode {
	
	public static class Node //静态函数main只能访问静态类和静态变量
	{
		public int data;
		public Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public static void common(Node head1,Node head2)
	{
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data)
			{
				head1=head1.next;
			}else if(head1.data>head2.data)
			{
				head2=head2.next;
			}else {
				System.out.println(head1.data);
				head1=head1.next;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);  
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		
		Node node2 = new Node(2);
		node2.next = new Node(3);
		node2.next.next = new Node(7);
		common(node1,node2);

	}

}
