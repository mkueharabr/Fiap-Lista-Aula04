import java.util.Scanner;

public class AcerteQuantidadeFeijoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int qtdeFeijoes = 0;
		
		while(qtdeFeijoes != 1238) {
			System.out.println("Informe a quantidade de feijões: ");
			qtdeFeijoes = leitor.nextInt();
			
		}
		
		System.out.println("Parabéns você acertou a quantidade exata");
		
		leitor.close();
	}

}
