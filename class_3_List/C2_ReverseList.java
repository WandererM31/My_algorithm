//6.1��ת������
//���������������ʱ�临�Ӷ�O(N),�ռ临�Ӷ�O(1)û���⿪���ڴ���Ǹı��˵�����ṹ
//�����ԣ��ĳ�˫�������β��ӡ���ö�ջ���ռ临�Ӷ�O(N)����
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
				System.out.print(point.data+" ");
				point = point.next;
			}
	}
	public Node reverse(Node head) //ֽ�ϻ�ͼ
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




