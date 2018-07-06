//手动实现链表结构：单向链表创建和从头到尾打印，双向链表创建和两头开始打印
//头插法，每插入一个新元素变为链表的头部head，尾部不变，最先插入的在尾
//尾插法，改变尾指针，head不变，最先插入的在head，最后插入的在end
package class_3_List;

public class C1_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List_1 list = new List_1();
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.next=node2; //这种写法是先创立节点再手动连接，不是用函数连接
        head.next.next = node3;
        list.printNode(head); //把头节点输进去打印
        
		
/*
 *      List_1 list = new List_1();
		list.addNote(5);
		list.addNote(6);
		list.addNote(7);
        list.printNode();
        
        List_2 list2 = new List_2();//双向链表
        list2.addNote(3);
        list2.addNote(4);
        list2.addNote(5);
        System.out.println(list2.head.data);
        System.out.println(list2.end.data);
        System.out.println(list2.head.next.data);
        System.out.println(list2.end.before.data);
        list2.printNode(); 
        list2.printNode2();
        */
	}

}
//双向链表
class List_2
{
	Node head = null;
	Node end =null; //尾指针
	class Node
	{
		public int data;
		public Node next;
		public Node before;
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
			head = newnode; //head与newnode指向同一块内存,head.next=newnode.next
			end = newnode;
			return;//原来void也可以return
		}
		head.before = newnode;
		Node tmp = head;//tmp--->head 老节点
		head = newnode; //head-->newnode 新节点变成队头
		head.next = tmp;//新节点连上老节点

	}
	public void printNode()//从头到尾打印
	{
		Node point = head;
		do
		{	
	    	System.out.println(point.data);
			point=point.next;
			if(point.next==null)
			{
				System.out.println(point.data);
				break;
			}
		}while(true);
	}
	public void printNode2()//从尾到头打印
	{
		Node point = end;
		do
		{	
	    	System.out.println(point.data);
			point=point.before;
			if(point.before==null)
			{
				System.out.println(point.data);
				break;
			}
		}while(true);
	}
}

class Node
{
	public int data;
	public Node next;
	public Node(int data)
	{
		this.data = data;
	}
}
class List_1//单链表
{
	Node head = null;
	
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
				System.out.println(point.data);
				point = point.next;
			}
	}
}




