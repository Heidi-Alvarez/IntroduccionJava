import java.util.Scanner;

public class KilometrosRecorridos{

	public static void main(String args[]){

		int i=5, j=0;
		double kilometros, litros, kmsuma=0, ltsuma=0;
		double kmprom, kmlt;
	
		System.out.format("Introduzca por favor la cantidad de lugares en los que agrego combustible \n");
		Scanner n =  new Scanner(System.in);
	
		i = n.nextInt();
	
		while(j<i-1)
			{
				if(j==0){
					System.out.format("Ingrese el valor numérico de los kilometros que recorrió en el primer trayecto \n");
					Scanner km = new Scanner(System.in);
					System.out.format("Ingrese la cantidad de litros de combustible que agregó en el primer trayecto \n");
					Scanner lt = new Scanner(System.in);
					kilometros = km.nextDouble();
					kmsuma = kilometros;
					litros = lt.nextDouble();
					ltsuma = litros;
					kmlt = kmsuma/ltsuma;
					System.out.format("Ha recorrido "+kmlt+" km por cada litro de combustible \n");
					}		
				else
					System.out.format("Ingrese el valor numérico de los kilometros que recorrió en el siguiente trayecto \n");	
					Scanner km = new Scanner(System.in);
					System.out.format("Ingrese la cantidad de litros de combustible que agregó en el siguiente trayecto \n");
					Scanner lt = new Scanner(System.in);
					kilometros = km.nextDouble();
					litros = lt.nextDouble();
					kmsuma+= kilometros;
					ltsuma+= litros;
					kmprom = kmsuma/(j+2);
					kmlt = kmsuma/ltsuma;
					System.out.format("En promedio ha recorrido "+kmprom+" de kilometros \n");
					System.out.format("Ha recorrido "+kmlt+" km por cada litro de combustible \n");
				j+=1;
			}
	}
}
