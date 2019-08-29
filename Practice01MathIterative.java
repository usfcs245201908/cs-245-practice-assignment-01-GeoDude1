public class Practice01MathIterative implements Practice01Math {
	public int fact(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Do not put negative numbers please.");
		}
		int fact=1, i=1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
	public int fib(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Do not put negative numbers please.");
		}
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
}