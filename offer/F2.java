//2018.5.16
//2017校招真题：
/*
 * Fibonacci数列是这样定义的：
F[0] = 0
F[1] = 1
for each i ≥ 2: F[i] = F[i-1] + F[i-2]
因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
输入描述:
输入为一个正整数N(1 ≤ N ≤ 1,000,000)
输出描述:
输出一个最小的步数变为Fibonacci数"
示例1
输入15
输出2
 */
package offer;

import java.io.*;

public class F2{
	   public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br= new BufferedReader(new 
	                InputStreamReader(System.in));
			System.out.println("input N:");
			 int n= Integer.parseInt(br.readLine());
			 int i=0;
			 int a;
			 System.out.print("Fibonacci:");
			 do {
				 a = Fibonacci(i);			
				 System.out.print(a+" ");
			     i++;
			 }while(a<=n);
			 System.out.println();
			 //System.out.println(Fibonacci(i-1)-n<=n-Fibonacci(i-2)?Fibonacci(i-1)-n:n-Fibonacci(i-2));
			 System.out.println("min step: "+Math.min(Fibonacci(i-1)-n, n-Fibonacci(i-2)));

		}
		public static int Fibonacci(int n) {
		    if (n==0||n==1)
		        return n;
		    //else
		        //return Fibonacci(n-1)+Fibonacci(n-2);
		        int result_1 = 1;
		        int result_2 = 0;
		        int result =0;
		    for(int i =2;i<=n;i++)
		    {   
		        result = result_1+result_2;
		        result_2 = result_1;
		        result_1 = result;
		    }
		        return result;
		    }
	}



