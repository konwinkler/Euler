public class problem005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 21;
		while(!divisible20(a)){
			a++;
		}
		System.out.println("");
		System.out.println(a);

	}

	static boolean isDivisible(int a, int b) {
		return ((a % b) == 0);
	}

	static boolean divisible20(int a) {
		for (int i = 1; i < 21; i++) {
			if (!isDivisible(a, i)) {
				return false;
			}
		}
		return true;
	}

}
