import java.util.Scanner;

public class OperacionesUsuario{

	public static void main(String args[]){
	
		int a=0, b=0;
		int suma=0, resta=0, prod=0; 
		float div;
	
		System.out.println("Por favor introduzca dos números naturales");
		Scanner val1 = new Scanner(System.in);
		Scanner val2 = new Scanner(System.in);
	
		a=val1.nextInt();
		b=val2.nextInt();
	
		suma=a+b;
		resta=a-b;
		prod=a*b;
		float ad=a, bd=b;
		div=ad/bd;
	
		System.out.format("La suma de los números " +a + " y "+b + " es igual a "+suma+"\n");
		System.out.format("La resta de los números " +a + " y "+b + " es igual a "+resta+"\n");
		System.out.format("El producto de los números " +a + " y "+b + " es igual a "+prod+"\n");
		System.out.format("La división de los números " +a + " y "+b + " es igual a "+div+"\n");
	}
}
