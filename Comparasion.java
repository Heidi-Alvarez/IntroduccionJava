import java.util.Scanner;

public class Comparasion{

	public static void main(String args[]){
	
		int a, b;
	
		System.out.println("Por favor ingrese dos números enteros");
		Scanner val1 = new Scanner(System.in);
		Scanner val2 = new Scanner(System.in);
		
		a = val1.nextInt();	
		b = val2.nextInt();	
	
		if(a<b){
			System.out.format("El número "+a+" es menor que el número "+b+"\n");
		}
		if(a>b){
			System.out.format("El número "+a+" es mayor que el número "+b+"\n");
		}
		if(a==b){
			System.out.format("Los números "+a+" y "+b+" son iguales \n");
		}
	}
}
