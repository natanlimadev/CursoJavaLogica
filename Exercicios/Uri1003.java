import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {
		// Nao esquecer de trocar a public class por main
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, Soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		Soma = A + B;
		
		System.out.println("SOMA = " + Soma);
		
		sc.close();
	}

}
