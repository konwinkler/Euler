import java.util.LinkedList;
import java.util.List;


public class Problem001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new LinkedList<Integer>();
		
		for(int i=0;i<1000;i++){
			if( isMultOf(i, 3) || isMultOf(i, 5)){
				System.out.println(i);
				l.add(i);
			}
		}
		
		int sum=0;
		for(int j:l){
			sum += j;
		}
		System.out.println("RESULT: "+sum);

	}
	
	
	static boolean isMultOf(int a, int b){
		int r = a % b;
		
		if (r==0){
			return true;
		}
		
		return false;
	}

}
