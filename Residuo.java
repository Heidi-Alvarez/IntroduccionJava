import java.util.Scanner;

public class Residuo{

	public static void main(String args[]){
	
	int a;
	
	System.out.format("Ingrese un número enteros por favor \n");

	Scanner num1 = new Scanner(System.in);
	
	a = num1.nextInt();
	
	if( (a%2)==0)
		System.out.format("El número "+a+" es un número par \n");
	else
		System.out.format("El número "+a+" es un número impar \n");
	
	}

}
