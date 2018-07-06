//6.13删除链表节点
package class_3_List;

public class C4_delectNode {
	
	public static class Node{
		public int data;
		public Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public static void printNode(Node head)//从头到尾打印
	{
		Node point = head;
			while(point!=null)
			{
				System.out.print(point.data+" ");
				point = point.next;
			}
		System.out.println();
	}
	
	//删除节点，遍历删除，时间复杂度O(N)
	public static Node delect(Node head,int i) {
		if(head.next==null) {
			
		}
		Node pre= head;
		Node bac = null;
		if(i==1) {
			head = head.next;//不返回头结点的话，即使更改了head只是参数传递，不是引用传递，原链表head不会变
			return head;
		}
		for(int j=1;j <i; j++) {
			bac = pre;
			pre = pre.next;
		}
		//循环结束后bac指向i-1，pre指向i，将bac.next指向i+1,pre.next指向null
		bac.next = pre.next;
		pre.next = null;	
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printNode(head);
        Node a = delect(head,5); //返回头结点
        printNode(a);
        
        Node head2 = new Node(1);
        printNode(head2);
        printNode(delect(head2,1));
	}

}
