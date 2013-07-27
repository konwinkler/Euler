
public class problem006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = sum1(100) - sum2(100);
		System.out.println(e);

	}
	
	static int sum1(int k){
		int sum = 0;
		for(int i=1;i<=k;i++){
			sum += i;
		}
		sum = (int) Math.pow(sum, 2);
		return sum;		
	}

	static int sum2(int k){
		int sum = 0;
		for(int i=1;i<=k;i++){
			sum += Math.pow(i, 2);
		}
		return sum;		
	}

}
