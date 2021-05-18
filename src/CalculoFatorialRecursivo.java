import java.util.Scanner;

public class CalculoFatorialRecursivo {

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
		double resultado;
		
		System.out.println("Informe o valor de N: ");
		valorN = leitor.nextInt();
		
		while(contador < valorN) {
			
			dividendo = fatorial(contador+1);
			divisor = fatorial(valorN - contador);
			
			resultado = (double) dividendo/divisor;
					
			System.out.println((contador + 1) + "!/" + (valorN - contador) + "! = " +
					dividendo + "/" + divisor + " = "
					+ resultado);
			contador ++;
		}
		
		leitor.close();

	}

	public static int fatorial(int numFatorial) {
		if (numFatorial <= 1) {
			return 1;
		}

		return (numFatorial * fatorial(numFatorial - 1));
	}

		
}
