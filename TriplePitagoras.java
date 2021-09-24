public class TriplePitagoras{

	public static void main(String args[]){
	
		int Hipotenusa=0;
		
		for( int C1=1; C1 < 501; C1++){
		
		
			for( int C2=C1+1; C2 < 501; C2++){
			
				for ( int H=1; H < 500000 ; H++){
				
					Hipotenusa = C1*C1 + C2*C2;
				
					if(Hipotenusa==(H*H)){
					
						System.out.format("H="+H+"\t C1="+C1+"\t C2="+C2+" \n");
					
					}
				}
			
			}
		
		}
		
	
	}

}
