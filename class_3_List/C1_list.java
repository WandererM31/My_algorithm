//�ֶ�ʵ������ṹ
package class_3_List;

public class C1_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new List();
		list.addNote(5);
		list.addNote(6);

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
	public void addNote(int num)
	{
		Node newnode = new Node(num);
		if(head==null)
		{
			//head.next = newnode; //����headû���ٿռ�
			head = newnode; //head��newnodeָ��ͬһ���ڴ�
			return;//ԭ��voidҲ����return
		}
		Node tmp = head;
		head.next = newnode;
		newnode.next = tmp;

	}
}




