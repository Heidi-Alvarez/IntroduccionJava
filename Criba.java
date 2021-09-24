public class Criba{

	public static void main(String args[]){
	
		boolean Criba[][] = new boolean[10][100];
		int numero=0, multiplo=0;
		
		for( int i=0; i < 10 ; i++){
		
			for( int j=0; j < 100 ; j++){
	
				numero = i*10 + j+1;
				
				if( numero == 1 ){
				
					Criba[i][j]=true;
				
				}
							
				for( int k=2; k <33; k++){
				
					multiplo = numero%k;

					if((multiplo==0) && (numero!=k)){

						Criba[i][j] = true;
						k=33;

					}
				}				
			
			}
		
		}
		
		for(int i=0; i < 10 ; i++){
		
			for(int j=0 ; j < 100; j++){
			
				if( Criba[i][j]==false){
				
					System.out.format(""+(i*10+j+1)+" ");
	//				System.out.format("*");  		
				}
				else{
				
					System.out.format(" ");
				
				}
			
			}
			System.out.format("\n");
		}
	
	
	}

}
