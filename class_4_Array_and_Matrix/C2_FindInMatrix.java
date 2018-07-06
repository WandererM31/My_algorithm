/*2018.6.1
 * 在行列都排好序的矩阵中找数
【题目】 给定一个有N*M的整型矩阵matrix和一个整数K，
matrix的每一行和每一 列都是排好序的。 实现一个函数， 判断K
是否在matrix中。 例如： 0 1 2 5 2 3 4 7 4
4 4 8 5 7 7 9 如果K为7， 返回true； 如果K为6， 返
回false。
【要求】 时间复杂度为O(N+M)， 额外空间复杂度为O(1)
 */
package class_4_Array_and_Matrix;

public class C2_FindInMatrix {
	
	public static boolean find(int[][] a, int K)
	{
		int H = 0;//行
		int L = a[0].length-1;//列
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
