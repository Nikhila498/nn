public class Fibonacci
{
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
	public static void Fibonacci(String[] args) {
		int result=fib(5);
		System.out.println("Fibonacci of 5 is:"+result);
		
	}
}