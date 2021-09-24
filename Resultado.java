import java.util.Scanner;

public class Resultado{

	public static void main(String args[]){

		System.out.format("Ingrese por favor una base y un exponente \n");
		Scanner num1 = new Scanner(System.in);
		int base = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		int exp = num2.nextInt();

		Potencia pow = new Potencia();
//		pow.potencia(base,exp);
	
		int resultado = pow.potencia(base,exp);	
		
		System.out.format(""+base+"**"+exp+"="+resultado+"\n");
	}

}
