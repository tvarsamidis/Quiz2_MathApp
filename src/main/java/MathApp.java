
public class MathApp {
	
	private static final int N = 15;

	public static void main(String[] args) {

		int numP = 0;
		int n = 2;

		System.out.println("The First " + N + " primes are:");
		for (n = 2; numP < N; n++) {
			if (isPrime(n)) {
				numP++;
				System.out.println("Prime #" + numP + " is " + n);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		int nsqrt = (int)Math.sqrt(n);
		for (int i = 2; i <= nsqrt; i++)
			if (n % i == 0)
				return false;
		return true;
	}
	
	public static int[] goldbach(int n) throws Exception {
		if (n <= 3)
			throw new Exception("Invalid range of argument");
		if (n % 2 != 0)
			throw new Exception("Odd argument");
		
		for (int p = 2; p <= n / 2; p++)
			if (isPrime(p) && isPrime(n - p))
				return (new int[]{p, n - p});
		
		throw new Exception("Goldbach not valid for " + n);
	}
}

