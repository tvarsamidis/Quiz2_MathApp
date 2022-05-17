import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class PrimesTest {

	@Test
	public void test() {
		assertEquals(false, MathApp.isPrime(1));
		assertEquals(true, MathApp.isPrime(2));
		assertEquals(true, MathApp.isPrime(3));
		assertEquals(false, MathApp.isPrime(4));
		assertEquals(true, MathApp.isPrime(7));
		assertEquals(false, MathApp.isPrime(20));
		assertEquals(true, MathApp.isPrime(101));
	}

	@Test
	public void testProb() {
		long n = System.currentTimeMillis();
		Random r = new Random(n);

		int num = Math.abs(r.nextInt());

		if (MathApp.isPrime(num)) {
			long nd = System.currentTimeMillis();
			Random rd = new Random(nd);

			int numsqrt = (int) Math.sqrt(num);
			for (int i = 0; i < numsqrt; i++) {
				int div = Math.abs(rd.nextInt());
				if (div == 0)
					continue;
				if (div == 1 || div == num)
					continue;
				assertNotEquals(0, num % div);
			}
		}
	}

}
