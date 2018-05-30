package offer;
import java.io.*;
public class Fibonacci {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new 
                InputStreamReader(System.in));
		 int n= Integer.parseInt(br.readLine());
		 int a = Fibonacci(n);
		 System.out.println(a);

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
