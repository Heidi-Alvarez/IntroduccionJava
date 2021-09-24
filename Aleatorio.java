import java.util.Random;

public class Aleatorio{

	public static void main(String args[]){
	
		double num=0.0;
		
		System.out.format("Números aleatorios entre 1 y 2\n");
		
		for( int i=0; i<5;i++){		
			num = 1+Math.random();		
			System.out.format(""+num+"\n");
		}
		System.out.format("Números aleatorios entre 1 y 100\n");
		for ( int i=0; i<5;i++){
			num = Math.random()*100;	
			System.out.format(""+Math.round(num)+"\n");
		}
		System.out.format("Números aleatorios entre 0 y 9\n");
		for ( int i=0; i<5;i++){
			num = Math.random()*9;	
			System.out.format(""+Math.round(num)+"\n");
		}
		System.out.format("Números aleatorios entre 1000 y 1112\n");
		for ( int i=0; i<5;i++){
			num =1000+Math.random()*112;	
			System.out.format(""+Math.round(num)+"\n");
		}
		System.out.format("Números aleatorios entre -1 y 1\n");
		for ( int i=0; i<5;i++){
			num = -1+Math.random()*2;	
			System.out.format(""+num+"\n");
		}
		System.out.format("Números aleatorios entre -3 y 11\n");
		for ( int i=0; i<5;i++){
			num = -3+ Math.random()*14;	
			System.out.format(""+Math.round(num)+"\n");
		}
										
			
	
	}

}
