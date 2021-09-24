import java.util.Scanner;

public class Promedio{

	public static void main(String args[]){
	
		int a, b, c;
		int suma, prod, prom, menor=0, mayor=0;
	
		System.out.format("Por favor ingrese tres números enteros diferentes \n");
		Scanner Z1 = new Scanner(System.in);
		Scanner Z2 = new Scanner(System.in);
		Scanner Z3 = new Scanner(System.in);
	
		a = Z1.nextInt();
		b = Z2.nextInt();
		c = Z3.nextInt();
	
		suma = a+b+c;
		prod = a*b*c;
		prom = (a+b+c)/3;
	
		if( (a>b) && (a>c) ){
			mayor=a;
		}
	
		if( (b>a) && (b>c) ){
			mayor=b;
		}
		if( (c>a) && (c>b) ){
			mayor=c;
		}
		
		if( (a<b) && (a<c) ){
			menor=a;
		}	
		
		if( (b<a) && (b<c) ){
			menor=b;
		}
		
		if( (c<a) && (c<b) ){
			menor=c;
		}
		
		System.out.format("La suma de los números "+a+", "+b+" y "+c+" es igual "+suma+"\n");
		System.out.format("El producto de los números "+a+", "+b+" y "+c+" es igual a "+prod+"\n");
		System.out.format("El promedio de los números "+a+", "+b+" y "+c+" es igual a "+prom+"\n");
		System.out.format("El número mayor es "+mayor+"\n");
		System.out.format("El número menor es "+menor+"\n");
	}

}
