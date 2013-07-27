public class problem012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iter = 1;
		int tri = 1;

		while (countD(tri) <= 5) {
			iter++;
			tri += iter;
		}
		System.out.println(tri);
	}

	static int countD(int a) {
		int c = 0;
		int d = a / 2;
		for (int i = 1; i <= d; i++) {
			if (isDivisor(a, i)) {
				c++;
			}
		}
		c++;
		return c;
	}

	static boolean isDivisor(int a, int b) {
		return ((a % b) == 0);
	}

}
