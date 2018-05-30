//2018.5.16
//2017У�����⣺
/*
 * Fibonacci��������������ģ�
F[0] = 0
F[1] = 1
for each i �� 2: F[i] = F[i-1] + F[i-2]
��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ...����Fibonacci�����е������ǳ�ΪFibonacci��������һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci����
��������:
����Ϊһ��������N(1 �� N �� 1,000,000)
�������:
���һ����С�Ĳ�����ΪFibonacci��"
ʾ��1
����15
���2
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



