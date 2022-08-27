import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		// public class must be Main for Uri online judge
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double trianguloRetangulo = (A * C) / 2.0;
		double areaDoCirculo = 3.14159 * Math.pow(C, 2.0);
		double areaDoTrapezio = ((A+B) * C) / 2;
		double areaDoQuadrado = Math.pow(B, 2.0);
		double areaDoRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);
		
		sc.close();
	}

}
