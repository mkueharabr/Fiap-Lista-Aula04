import java.util.Scanner;

public class EstatisticaNotas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double nota, media;
		int alunosAcimaMedia = 0;
		int alunosAbaixoMedia = 0;
		int contador = 0;
		int qtdeAlunos;
		
		System.out.println("Informe a quantidade de alunos: ");
		qtdeAlunos = leitor.nextInt();
		
		System.out.println("Informe a média: ");
		media = leitor.nextDouble();
		
		while(contador < qtdeAlunos) {
			System.out.println("Informe a nota do " + (contador + 1) + " aluno: ");
			nota = leitor.nextDouble();
			
			if (nota >= media) {
				alunosAcimaMedia ++;
			} else {
				alunosAbaixoMedia ++;
			}
			
			contador ++;
				
		}
		
		System.out.println("Total de alunos acima da média: " + alunosAcimaMedia);
		System.out.println("Total de alunos abaixo da média: " + alunosAbaixoMedia);
		
		
		leitor.close();
		
	}

}
