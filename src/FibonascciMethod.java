
public class FibonascciMethod {
	static int Fibonacci(int count) {
		if (count == 1 || count == 2)
			return 1;
		return Fibonacci(count - 1) + Fibonacci(count - 2);
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci(5));
	}

}
