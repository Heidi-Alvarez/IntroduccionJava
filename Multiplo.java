import java.util.Scanner;

public class Multiplo{

	public static void main(String args[]){
	
	int a, b, mod;
	
	System.out.format("Ingrese dos números enteros por favor \n");
	
	Scanner num1 = new Scanner(System.in);
	Scanner num2 = new Scanner(System.in);
	
	a = num1.nextInt();
	b = num2.nextInt();
	
	if( (a>b) ^ (a==b)){
		mod=a%b;
		if(mod==0)
			System.out.format("El número "+a+" es múltiplo del número "+b+" \n");
		else
			System.out.format("Los números "+a+" y "+b+" no son múltiplos el uno del otro \n");
	}
	
	if(a<b){
		mod=b%a;
		if(mod==0)
			System.out.format("El número "+b+" es múltiplo del número "+a+" \n");
		else
			System.out.format("Los números "+a+" y "+b+" no son múltiplos el uno del otro \n");
	}
	}

}
