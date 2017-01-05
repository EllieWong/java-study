fib(n)=fib(n - 1) + fib(n - 2)
The first two numbers are 0 and 1.
The i th number is the sum of i-1 th number and i-2 th number.
The first ten numbers in Fibonacci sequence is:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
Example
Given 1, return 0
Given 2, return 1
Given 10, return 34
Note
The Nth fibonacci number won't exceed the max value of signed 32-bit integer in the test cases.


public class Fibonacci {

//方法1：
  public int fibonacci1(int n){
		if(n<=1)
			return 0;
		int first = 0;
		int second = 1;
		for(int i=2;i<n;i++){
			int temp = second;
			second = first + second;
			first = temp;
		}
		return second;
	}
	
  //方法2：直接用数组存储所有值，注意数组下标与fib(n)差一位	
  public int fibonacci2(int n){
		if(n<=1)
			return 0;
		int[] fib = new int[n];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<n;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib[n-1];
	}
  
  /*
  方法3：递归
    Recursive. Long time complexity
    Timeout
*/

  public int fibonacci3(int n) {
        if (n <= 1) {
            return 0;
        } 
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
  
  
	public static void main(String[] args){
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibonacci2(10));
	}
  
}
