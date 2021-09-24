import java.util.Scanner;

public class NumerosInvertidos{

	public static void main(String args[]){
	
		int potencia=1, potenciainvertida=1, digito=0, numinvertido=0;
	
		
		System.out.format("Por favor ingrese un número entero positivo \n");
		Scanner valor = new Scanner(System.in);
		int num = valor.nextInt();
		String tam = Integer.toString(num);
		int exp = tam.length()-1;
		
		for( int i = 0; i <= exp ; i++){
		
			int j = exp-i;
			potencia = 1;
			while( j > 0){
			
				potencia = potencia*10;		
				j = j-1;
			
			} 
			potenciainvertida = 1;
			for(int k=0; k < i; k++){
			
				potenciainvertida = potenciainvertida*10;
			}
			digito = num/potencia;
			numinvertido = numinvertido+digito*potenciainvertida;
			num = num - digito*potencia;
		
		}
	
		System.out.format("El numero número invertido es "+numinvertido+"\n");
	}

}
