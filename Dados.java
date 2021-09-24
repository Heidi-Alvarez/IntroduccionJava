public class Dados{

	public static void main(String args[]){
	
		int[] SumaDados = new int[11];
		SumaDados[0] = 0; SumaDados[1] = 0; SumaDados[2] = 0; SumaDados[3] = 0;
		SumaDados[4] = 0; SumaDados[5] = 0; SumaDados[6] = 0; SumaDados[7] = 0;
		SumaDados[8] = 0; SumaDados[9] = 0; SumaDados[10] = 0;  
		
		for( int i =0; i<36000; i++){
		
			int dado1 = (int)(Math.random()*6+1);
			int dado2 = (int)(Math.random()*6+1);
			int suma = dado1+dado2;
		
			switch(suma){
		
				case 2:
					SumaDados[0] = SumaDados[0] + 1;
					break;
			
				case 3:
					SumaDados[1] = SumaDados[1] + 1;
					break;
				
				case 4:
					SumaDados[2] = SumaDados[2] + 1;
					break;
				
				case 5:
					SumaDados[3]= SumaDados[3]+1;			
					break;
					
				case 6:
					SumaDados[4]=SumaDados[4]+ 1;			
				break;
				
				case 7:
					SumaDados[5] = SumaDados[5] + 1;
					break;
				
				case 8:
					SumaDados[6]= SumaDados[6]+1;			
					break;
				
				case 9:
					SumaDados[7] = SumaDados[7] + 1;
					break;
				
				case 10:
					SumaDados[8] = SumaDados[8] + 1;
					break;
				
				case 11:
					SumaDados[9] = SumaDados[9] + 1;
					break;
				
				case 12:
					SumaDados[10] = SumaDados[10] + 1;
					break;
			}	
		}

		
		System.out.format("2 \t "+SumaDados[0]+"\n"+"3 \t "+SumaDados[1]+"\n"+"4 \t "+SumaDados[2]+"\n");
		System.out.format("5 \t "+SumaDados[3]+"\n"+"6 \t "+SumaDados[4]+"\n"+"7 \t "+SumaDados[5]+"\n");
		System.out.format("8 \t "+SumaDados[6]+"\n"+"9 \t "+SumaDados[7]+"\n"+"10 \t "+SumaDados[8]+"\n");
		System.out.format("11 \t "+SumaDados[9]+"\n"+"12 \t "+SumaDados[10]+"\n");

		
	}

}
