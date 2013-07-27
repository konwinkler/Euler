import java.util.LinkedList;
import java.util.List;


public class problem010 {
	static List<Integer> primes = new LinkedList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=2; i<2000000; i++){
			if(isPrime(i)){
				primes.add(i);
				//System.out.println(i);
			}
		}
		
		
		long sum = 0l;
		for(int i:primes){
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	static boolean isPrime(int a){
		for(int i:primes){
			if((a%i)==0){
				return false;
			}
		}		
		return true;
	}

}
