//6.1反转单链表
//单链表逆序输出，时间复杂度O(N),空间复杂度O(1)没额外开辟内存而是改变了单链表结构
//还可以：改成双向链表从尾打印？用堆栈（空间复杂度O(N)）？
package class_3_List;

public class C2_ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		list.addNote(5);
		list.addNote(6);
		list.addNote(7);
		list.printNode(list.head);
		System.out.println("\n"+list.head.data);
	
		list.printNode(list.reverse(list.head));
	}

}

class List
{
	Node head = null;
	class Node
	{
		public int data;
		public Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public void addNote(int num)//头插法
	{
		Node newnode = new Node(num);
		if(head==null)
		{
			//head.next = newnode; //错误，head没开辟空间
			head = newnode; //head与newnode指向同一块内存,head.next=newnode.next
			return;//原来void也可以return
		}
		Node tmp = head;//tmp--->head 老节点
		head = newnode; //head-->newnode 新节点变成队头
		head.next = tmp;//新节点连上老节点

	}
	public void printNode(Node head)//从头到尾打印
	{
		Node point = head;
			while(point!=null)
			{
				System.out.print(point.data+" ");
				point = point.next;
			}
	}
	public Node reverse(Node head) //纸上画图
	{
		Node next = null;
		Node pre = null;
		while(head!=null)
		{
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	
	}
}




