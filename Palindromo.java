import java.util.Scanner;

public class Palindromo{

	public static void main(String args[]){
		
		int tam;
//		String l1, l2, l3, l4; 
		String palabra;
		
		System.out.format("Introduce por favor una palabra de cinco letras \n");
		Scanner word = new Scanner(System.in);
		
		palabra = word.nextLine();
								
		tam = palabra.length();
		
		if(tam != 5){
			System.out.format("Error: la palabra que introdujo no es de cinco letras \n");
		}
		else{
			String l1 = palabra.SubString(0,1);
//			l2 = palabra.SubString(1,2);
//			l3 = palabra.SubString(3,4);
//			l4 = palabra.SubString(4,5);
//			if((l1 == l4) && (l2==l3)){
			System.out.format("La palabra "+palabra+" es un palíndromo \n");
		    }
//			else{
//				System.out.format("La palabra "+palabra+" no es un palíndromo \n");
//			}
			
			
		
	}
}
