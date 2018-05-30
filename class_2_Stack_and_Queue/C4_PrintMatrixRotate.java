//2018.5.30转圈打印矩阵 
//圈打印任意大小的矩阵，怎么保证最后只输出一行是从左到右而不是从右到左呢
//也就是矩阵列数和行数，大于，小于，相等的关系
//好像下面都满足
package class_2_Stack_and_Queue;

public class C4_PrintMatrixRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};//5*4
		//int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};//4*3
		//int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//3*4
		//int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};//4*5
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};//4*4
		
		System.out.println(a[0].length);//列数4
		System.out.println(a.length); //行数3
		
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
		int ru = 0; //上行标初始值
		int rd = rlength-1;//下行标初始值
		int cr = clength-1; //右列标初值
		int cl = 0; //左列标初值
		while(ru<=rd && cr>=cl) {
			//有任意两个相等，则只输出一行
			if(ru==rd)
			{
				for(int i=cl;i<=cr;i++) //从左到右
				{
					System.out.print(a[ru][i]+" "); //行不变，列动
				}
				ru++;
			}else if(cl==cr)//有任意两个相等，则只输出一行
			{
				for(int i=ru;i<=rd;i++) //从上到下
				{
					System.out.print(a[i][cr]+" "); //行变，列不变
				}
				cr--;
			}else
				//改变下标值打印
			{
				for(int i=cl;i<=cr;i++) //从左到右
				{
					System.out.print(a[ru][i]+" "); //行不变，列动
				}
				ru++;
				//System.out.println(ru);
				for(int i=ru;i<=rd;i++) //从上到下
				{
					System.out.print(a[i][cr]+" "); //行变，列不变
				}
				cr--;
				//System.out.println(cr);
				for(int i=cr;i>=cl;i--) //从右到左
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