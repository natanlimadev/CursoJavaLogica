import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {
		//trocar o public class por main antes de publicar no URI
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, prod;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		prod = n1 * n2;
		
		System.out.println("PROD = " + prod);
		
		sc.close();
	}

}
