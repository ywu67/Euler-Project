
public class evenfibonacci {
	public static void main(String[] args){
		long sum = 0;
		long fib1 = 1;
		long fib2 = 1;
		long fib = 0;
		while(fib < 4000000)
		{
			fib = fib1+fib2;
			fib1 = fib2;
			fib2 = fib;
			if (fib % 2 ==0)
				sum = sum+fib;
		}
		System.out.println(sum);
		
	}

}
