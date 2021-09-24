import java.util.Scanner;

public class Adivinar{

	public static void main(String args[]){
		
		double numero = Math.floor(Math.random()*1000 +1);
	
		System.out.format("Adivine un número entre 1 y 1000\n");
		Scanner valin = new Scanner(System.in);
		double val = valin.nextDouble();

		
		if(val==numero){
		
			System.out.format("¡Ha adivinado el número! \n");
		
		}
		else{		
			if( (numero-val)>0){
				System.out.format("El número que busca es más grande \n Vuelva a intentarlo \n");
				Scanner valin2 = new Scanner(System.in);
				double val2 = valin2.nextDouble();				
				if(val2 == numero){
					System.out.format("¡Ha adivinado el número! \n");
				}
				else{				
					if( (numero-val2)>0 ){					
						System.out.format("El número que busca es más grande \n Vuelva a intentarlo, última oportunidad \n");
						Scanner valin3 = new Scanner(System.in);
						double val3 = valin3.nextDouble();						
						if(val3 == numero){						
							System.out.format("¡Ha adivinado el número! \n");					
						}
						else{						
						System.out.format("¡Hoy no ha sido su día de suerte! \n");					
						}
					}
					else{
						System.out.format("El número que busca es más pequeño \n Vuelva a intertarlo, última oportunidad \n");
						Scanner valin4 = new Scanner(System.in);
						double val4 = valin4.nextDouble();
						if(val4==numero){
							System.out.format("¡Ha adivinado el número! \n");
						}
						else{
							System.out.format("¡Hoy no es su día de suerte! \n");
						}
					
					}
				}
			}
			else{
				System.out.format("El número que busca es más pequeño \n Vuelva a intentarlo \n");
				Scanner valin5 = new Scanner(System.in);
				double val5 = valin5.nextDouble();
				if( val5==numero){
					System.out.format("¡Ha adivinado el número! \n");
				}
				else{
					if( (numero-val5)>0){
						System.out.format("El número que busca es más grande \n Vuelva a intentarlo, última oportunidad \n");
						Scanner valin6 = new Scanner(System.in);
						double val6 = valin6.nextDouble();
						if(val6==numero){
							System.out.format("¡Ha adivinado el número! \n");
						}
						else{
							System.out.format("¡Hoy no es su día de suerte!\n");
						}
					}
					else{
						System.out.format("El número que busca es más pequeño \n Vuelva a intentarlo, última oportunidad \n");
						Scanner valin7 = new Scanner(System.in);
						double val7 = valin7.nextDouble();
						if(val7==numero){
							System.out.format("¡Ha adivinado el número! \n");
						}
						else{
							System.out.format("¡Hoy no es su día de suerte! \n");
						}
					}
				
				}
					
			}
				
				
		
		}

	}
}
