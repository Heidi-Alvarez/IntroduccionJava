import java.util.Scanner;

public class MayorMenor{

	public static void main(String args[]){
	
		int num1, num2, num3, num4, num5, mayor, menor;
		
		System.out.format("Por favor ingrese cinco números enteros \n");
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		Scanner entrada5 = new Scanner(System.in);
		
		num1 = entrada1.nextInt();
		num2 = entrada2.nextInt();
		num3 = entrada3.nextInt();
		num4 = entrada4.nextInt();
		num5 = entrada5.nextInt();
		
		mayor = num1;
		
		if(mayor<num2){
			mayor=num2;
		}
		if(mayor<num3){
			mayor=num3;
		}
		if(mayor<num4){
			mayor=num4;
		}
		if(mayor<num5){
			mayor=num5;
		}
		
		menor = num1;
		
		if(menor>num2){
			menor=num2;
		}
		if(menor>num3){
			menor=num3;
		}
		if(menor>num4){
			menor=num4;
		}
		if(menor>num5){
			menor=num5;
		}
		if(mayor==menor)
			System.out.format("Todos los números son iguales \n");
		else
			System.out.format("El número mayor es "+mayor+" mientras que el número menor es "+menor+ "\n");
		
	}

}
