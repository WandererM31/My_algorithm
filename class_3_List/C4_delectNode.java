//6.13ɾ������ڵ�
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
	public static void printNode(Node head)//��ͷ��β��ӡ
	{
		Node point = head;
			while(point!=null)
			{
				System.out.print(point.data+" ");
				point = point.next;
			}
		System.out.println();
	}
	
	//ɾ���ڵ㣬����ɾ����ʱ�临�Ӷ�O(N)
	public static Node delect(Node head,int i) {
		if(head.next==null) {
			
		}
		Node pre= head;
		Node bac = null;
		if(i==1) {
			head = head.next;//������ͷ���Ļ�����ʹ������headֻ�ǲ������ݣ��������ô��ݣ�ԭ����head�����
			return head;
		}
		for(int j=1;j <i; j++) {
			bac = pre;
			pre = pre.next;
		}
		//ѭ��������bacָ��i-1��preָ��i����bac.nextָ��i+1,pre.nextָ��null
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
        Node a = delect(head,5); //����ͷ���
        printNode(a);
        
        Node head2 = new Node(1);
        printNode(head2);
        printNode(delect(head2,1));
	}

}
