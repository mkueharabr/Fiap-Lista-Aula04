import java.util.Scanner;

public class CalculoFatorial {

	/*
	 * Para uma sequência matemática onde cada elemento é calculado da seguinte forma:
	 *		1!/N! ; 2!/(N-1)!; 3!/(N-2)!; ... ; (N! / 1!)
	 * Crie um programa onde o usuário digite a quantidade de elementos que deseja exibir e 
	 * sejam exibidos os elementos da sequência.
	 * 
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valorN;
		int contador = 0;
		int dividendo;
		int divisor;
		int sequencia;
		double resultado;
		
		System.out.println("Informe o valor de N: ");
		valorN = leitor.nextInt();
		
		while(contador < valorN) {
			
			sequencia = contador + 1;
			dividendo = 1;
			
			while (sequencia > 0) {
				dividendo = dividendo * sequencia;
				sequencia --;
			}
			
			sequencia = valorN - contador;
			divisor = 1;
			
			while (sequencia > 0) {
				divisor = divisor * sequencia;
				sequencia --;
			}
			
			resultado = (double) dividendo/divisor;
					
			System.out.println((contador + 1) + "!/" + (valorN - contador) + "! = " +
					dividendo + "/" + divisor + " = "
					+ resultado);
			contador ++;
		}
		
		leitor.close();
		
	}

}
