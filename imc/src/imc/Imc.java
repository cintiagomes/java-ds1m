package imc;

public class Imc {

	public static void main(String[] args) {
		
		float peso;
		float altura;
		float imc;
		
		peso = 58;
		altura = 1.63f;
		
		imc = peso / (altura * altura);
		
		System.out.print(imc);
		
	}
	
}
