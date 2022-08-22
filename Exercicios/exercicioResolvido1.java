import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido1 {

	public static void main(String[] args) {
		// exercicio para fixar os aprendizados
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a Largura");
		Double largura = sc.nextDouble();
		
		System.out.println("Digite Comprimento");
		Double comprimento = sc.nextDouble();
		
		System.out.println("Digite o Valor do Metro Quadrado");
		Double valorMetroQuadrado = sc.nextDouble();
		
		Double Area = largura * comprimento;
		Double Preco = Area * valorMetroQuadrado;
		
		System.out.printf("Area = %.2f%n", Area);
		System.out.printf("Preço = R$ %.2f%n", Preco);
		
		
		sc.close();
	}

}
