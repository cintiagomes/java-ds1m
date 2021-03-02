package retangulo;

public class Retangulo {
	
	public static void main(String[] args) {
		
		float altura;
		float base;
		float perimetro;
		float area;
		
		altura = 6;
		base = 14;
		
		area = base * altura;
		perimetro = (base * 2 ) + (altura * 2 );
		
		System.out.print("Perímetro do retangulo: ");
		System.out.println(perimetro);
		System.out.print("Área do retangulo: " + area + " metros");
		
	}

}
