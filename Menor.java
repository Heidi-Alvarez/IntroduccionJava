import java.util.Scanner;

public class Menor{

	public static void main(String args[]){
	
		int n, valor, menor;
		
		System.out.format("¿Cuál es la cantidad de números que va a ingresar? \n");
		Scanner num = new Scanner(System.in);
		
		n = num.nextInt();
		
		System.out.format("Ingrese un número entero \n");
		Scanner val0 = new Scanner(System.in);
		menor = val0.nextInt();
		
		for(int i=1; i<n; i++){
			System.out.format("Ingrese otro número entero \n");
			Scanner val = new Scanner(System.in);
			valor = val.nextInt();
			if(valor < menor){
				menor = valor;
			}
		}
		
		System.out.format("El número menor entre los enteros ingresados es "+menor+"\n");
	}

}
