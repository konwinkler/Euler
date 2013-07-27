
public class problem007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i = 1;
		while( count < 10001){
			i++;
			if( isPrime(i)){
				count++;
			}
		}
		System.out.println(i);

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
