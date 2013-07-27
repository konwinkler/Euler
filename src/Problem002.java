
public class Problem002 {

	
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		
		int c = 0;
		int sum = 0;
		
		while (b < 4000000){
			c = a+b;
			if (isEven(c)){
				System.out.println(c);
				sum += c;
			}
			a = b;
			b = c;
		}
		
		System.out.println(sum);
	}
	
	static boolean isEven(int i){
		if((i % 2)==0)
		{
			return true;
		} else {
			return false;
		}
	}
}
