public class Potencia{

	public int potencia(int base,int exp){

		int resultado = base;
			
		for( int i=1; i<exp;i++ ){
	
			resultado = resultado*base;
	
		}
			
		return resultado;

	}
}
