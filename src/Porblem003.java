public class Porblem003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long i;
		long end;
		end = 600851475143l;

		for (i = 2; i < end; i++) {
			if (dividsBy(end, i)) {
				if (isPrime(i)) {
					System.out.println(i);
				}

			}
		}

	}

	static boolean dividsBy(long a, long b) {
		if ((a % b) == 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isPrime(long a) {
		for (long i = 2; i < a; i++) {
			if (dividsBy(a, i)) {
				return false;
			}
		}

		return true;
	}

}
