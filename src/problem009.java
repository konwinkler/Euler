
public class problem009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int c=3; c<1001; c++){
			for(int b=2; b<c; b++){
				for(int a=1; a<b; a++){
					if((a+b+c)==1000){
						int xa = (int) Math.pow(a, 2);
						int xb = (int) Math.pow(b, 2);
						int xc = (int) Math.pow(c, 2);
						
						if((xa+xb)==xc){
							int res = a*b*c;
							System.out.println(res);
							break;
						}
						
					}
				}
			}
		}

	}
	
	

}
