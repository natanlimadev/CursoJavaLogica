import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {
		// nao esquecer de mudar a public class para Main
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, Diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = A * B - C * D;
		
		System.out.println("DIFERENCA = " + Diferenca);
		
		sc.close();
	}

}
