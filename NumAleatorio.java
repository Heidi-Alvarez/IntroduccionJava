public class NumAleatorio{

	public static void main(String args[]){
	
		double num=0.0;
	
		for( int i = 0; i< 10; i++){
		
			num = 1+Math.random()*5;
			int j = (int)num;

			switch(j){
			
				case 1:
					System.out.format("2 \t 3 \t 6 \n");
					break;
				
				case 2:
					System.out.format("4 \t 5 \t 10 \n");
					break;
					
				case 3:
					System.out.format("6 \t 7 \t 14 \n");
					break;		
					
				case 4:
					System.out.format("8 \t 9 \t 18 \n");
					break;
					
				case 5:
					System.out.format("10 \t 11 \t 22 \n");
					break;
			}
		}
	
	}

}
