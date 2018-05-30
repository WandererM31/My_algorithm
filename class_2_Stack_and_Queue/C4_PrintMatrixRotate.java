//2018.5.30תȦ��ӡ���� 
//Ȧ��ӡ�����С�ľ�����ô��֤���ֻ���һ���Ǵ����Ҷ����Ǵ��ҵ�����
//Ҳ���Ǿ������������������ڣ�С�ڣ���ȵĹ�ϵ
//�������涼����
package class_2_Stack_and_Queue;

public class C4_PrintMatrixRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};//5*4
		//int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};//4*3
		//int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//3*4
		//int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};//4*5
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};//4*4
		
		System.out.println(a[0].length);//����4
		System.out.println(a.length); //����3
		
		Rotate rotate = new Rotate(a, a.length, a[0].length);
		rotate.print();
		
	}
}
class Rotate
{
	private int[][] a;
	private int rlength;
	private int clength;
	public Rotate(int[][] a, int rlength,int clength) {
		this.a = a;
		this.rlength = rlength;
		this.clength = clength;
	}
	public void print()
	{
		int ru = 0; //���б��ʼֵ
		int rd = rlength-1;//���б��ʼֵ
		int cr = clength-1; //���б��ֵ
		int cl = 0; //���б��ֵ
		while(ru<=rd && cr>=cl) {
			//������������ȣ���ֻ���һ��
			if(ru==rd)
			{
				for(int i=cl;i<=cr;i++) //������
				{
					System.out.print(a[ru][i]+" "); //�в��䣬�ж�
				}
				ru++;
			}else if(cl==cr)//������������ȣ���ֻ���һ��
			{
				for(int i=ru;i<=rd;i++) //���ϵ���
				{
					System.out.print(a[i][cr]+" "); //�б䣬�в���
				}
				cr--;
			}else
				//�ı��±�ֵ��ӡ
			{
				for(int i=cl;i<=cr;i++) //������
				{
					System.out.print(a[ru][i]+" "); //�в��䣬�ж�
				}
				ru++;
				//System.out.println(ru);
				for(int i=ru;i<=rd;i++) //���ϵ���
				{
					System.out.print(a[i][cr]+" "); //�б䣬�в���
				}
				cr--;
				//System.out.println(cr);
				for(int i=cr;i>=cl;i--) //���ҵ���
				{
					System.out.print(a[rd][i]+" ");
				}
				rd--;
				//System.out.println(rd);
				for(int i=rd;i>=ru;i--)
				{
					System.out.print(a[i][cl]+" ");
				}
				cl++;
				//System.out.println(cl);
				}
			}
	}
}