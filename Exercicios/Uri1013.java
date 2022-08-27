import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		//change public Class for Main of URI online Judge
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		
		System.out.println(maiorABC + " eh o maior");
		
		sc.close();
	}

}
