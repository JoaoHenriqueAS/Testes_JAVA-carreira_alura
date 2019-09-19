
public class Multiplos3 {
	
	public static void main(String[] args) {
		
		for (int numero = 1; numero <= 100; numero ++ ) {
			if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}
		
		//OU
		System.out.println("--------------------------------");
		for (int num = 3; num <= 100; num += 3) {
			System.out.println(num);
		}
	}

}



