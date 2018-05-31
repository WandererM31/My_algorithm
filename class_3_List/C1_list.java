//手动实现链表结构
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
			//head.next = newnode; //错误，head没开辟空间
			head = newnode; //head与newnode指向同一块内存
			return;//原来void也可以return
		}
		Node tmp = head;
		head.next = newnode;
		newnode.next = tmp;

	}
}




