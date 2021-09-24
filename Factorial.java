public class Factorial{

	public static void main(String args[]){
	
		int fac=1, n=5;
		
		for( int i=0 ; i <= n ; i++ ){
		
			if(i==0){
				System.out.format(""+i+"! = "+fac+" \n");
			}
			else{
				fac = fac*i;
				System.out.format(""+i+"! = "+fac+" \n");
			}
		}
	
	}

}
