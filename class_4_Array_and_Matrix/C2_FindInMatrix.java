/*2018.6.1
 * �����ж��ź���ľ���������
����Ŀ�� ����һ����N*M�����;���matrix��һ������K��
matrix��ÿһ�к�ÿһ �ж����ź���ġ� ʵ��һ�������� �ж�K
�Ƿ���matrix�С� ���磺 0 1 2 5 2 3 4 7 4
4 4 8 5 7 7 9 ���KΪ7�� ����true�� ���KΪ6�� ��
��false��
��Ҫ�� ʱ�临�Ӷ�ΪO(N+M)�� ����ռ临�Ӷ�ΪO(1)
 */
package class_4_Array_and_Matrix;

public class C2_FindInMatrix {
	
	public static boolean find(int[][] a, int K)
	{
		int H = 0;//��
		int L = a[0].length-1;//��
		while(L>=0&&H<=a.length-1)
		{
			if(a[H][L]==K)
				return true;
			else if(a[H][L]>K)
			{
				L--;
			}else {
				H++;
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] { { 0, 1, 2, 3, 4, 5, 6 },// 0
			{ 10, 12, 13, 15, 16, 17, 18 },// 1
			{ 23, 24, 25, 26, 27, 28, 29 },// 2
			{ 44, 45, 46, 47, 48, 49, 50 },// 3
			{ 65, 66, 67, 68, 69, 70, 71 },// 4
			{ 96, 97, 98, 99, 100, 111, 122 },// 5
			{ 166, 176, 186, 187, 190, 195, 200 },// 6
			{ 233, 243, 321, 341, 356, 370, 380 } // 7
	};
	int K = 234;
	System.out.println(find(matrix, K));
	}

}
