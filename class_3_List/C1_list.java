//�ֶ�ʵ������ṹ�������������ʹ�ͷ��β��ӡ��˫������������ͷ��ʼ��ӡ
//ͷ�巨��ÿ����һ����Ԫ�ر�Ϊ�����ͷ��head��β�����䣬���Ȳ������β
//β�巨���ı�βָ�룬head���䣬���Ȳ������head�����������end
package class_3_List;

public class C1_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List_1 list = new List_1();
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.next=node2; //����д�����ȴ����ڵ����ֶ����ӣ������ú�������
        head.next.next = node3;
        list.printNode(head); //��ͷ�ڵ����ȥ��ӡ
        
		
/*
 *      List_1 list = new List_1();
		list.addNote(5);
		list.addNote(6);
		list.addNote(7);
        list.printNode();
        
        List_2 list2 = new List_2();//˫������
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
//˫������
class List_2
{
	Node head = null;
	Node end =null; //βָ��
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
	public void addNote(int num)//ͷ�巨
	{
		Node newnode = new Node(num);
		if(head==null)
		{
			head = newnode; //head��newnodeָ��ͬһ���ڴ�,head.next=newnode.next
			end = newnode;
			return;//ԭ��voidҲ����return
		}
		head.before = newnode;
		Node tmp = head;//tmp--->head �Ͻڵ�
		head = newnode; //head-->newnode �½ڵ��ɶ�ͷ
		head.next = tmp;//�½ڵ������Ͻڵ�

	}
	public void printNode()//��ͷ��β��ӡ
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
	public void printNode2()//��β��ͷ��ӡ
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
class List_1//������
{
	Node head = null;
	
	public void addNote(int num)//ͷ�巨
	{
		Node newnode = new Node(num);
		if(head==null)
		{
			//head.next = newnode; //����headû���ٿռ�
			head = newnode; //head��newnodeָ��ͬһ���ڴ�,head.next=newnode.next
			return;//ԭ��voidҲ����return
		}
		Node tmp = head;//tmp--->head �Ͻڵ�
		head = newnode; //head-->newnode �½ڵ��ɶ�ͷ
		head.next = tmp;//�½ڵ������Ͻڵ�

	}
	public void printNode(Node head)//��ͷ��β��ӡ
	{
		Node point = head;
			while(point!=null)
			{
				System.out.println(point.data);
				point = point.next;
			}
	}
}




