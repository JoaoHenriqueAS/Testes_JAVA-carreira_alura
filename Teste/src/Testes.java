
public class Testes {
	
	public static void main(String[] args) {
		int idade = 10;
		String name = "Maria";
		
		System.out.println(name + idade);
		
		if (name == "Joao") {
			System.out.println("parabens");
		} else {
			System.out.println("ta errado");
		}
		
		int num = 0;
		for (num = 1; num <= 10; num++) {
			System.out.println("oi " + num);
		}
		
		int contador = 1;
		while (contador <= 10) {
			
			System.out.println("tchau " + contador);
			contador++;	
		}
	}

}
