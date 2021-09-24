public class Formas{

	public static void main(String args[]){

		for(int i=1; i<11; i++){
	
			for(int j=1; j <= i; j++){
		
				System.out.format("*");
		
			}
		
			System.out.format("\n");
	
		}
		
		for(int i=1; i<11; i++){
		
			for(int j=10; j>=i; j--){
			
				System.out.format("*");
			}
			
			System.out.format("\n");
		}

		for(int i=1; i<11 ; i++){	
			if(i==1){			
				for(int j=0; j<10 ; j++){
					System.out.format("*");									
				   	}
			       }
			if(i>1){
				for( int k=1; k<i; k++){
				
					System.out.format(" ");
				
					}
				
				for(int l = 0; l<(11-i) ; l++){
				
					System.out.format("*");
				
					} 
			
			    }
			    
			System.out.format("\n");
			}
			
		for(int i=1; i<11; i++){
			for(int j=1; j<=(10-i); j++){
				System.out.format(" ");			
			}
			for(int k=1;k<=i;k++){
				System.out.format("*");
			}
			System.out.format("\n");
		}
		
		}


	}

