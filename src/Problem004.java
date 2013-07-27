public class Problem004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = 1;

		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				int c = a * b;
				if (isPalindrom(c)) {
					System.out.println(c);
					if (c > res) {
						res = c;
					}
				}
			}
		}
		System.out.println(res);

	}

	static boolean isPalindrom(int p) {
		int q = p;
		boolean go = true;
		int end = 0;
		while (go == true) {
			int m = q % 10;
			end = end * 10 + m;
			q = q / 10;
			if (q == 0) {
				go = false;
			}
		}
		return (p == end);
	}

}
