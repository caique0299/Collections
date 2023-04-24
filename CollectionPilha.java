package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int op;
		
		Stack<String> pilhaLivros = new Stack<>();
		
		do {
			
			System.out.println("\n** Menu da estante Generation **\n");
			System.out.println("1 - Adicionar livro.");
			System.out.println("2 - Listar todos os livros.");
			System.out.println("3 - Retirar um livro.");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada:");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o título do livro que deseja adicionar: ");
				String adicionarLivro = ler.nextLine();
				pilhaLivros.add(adicionarLivro);
				System.out.printf("Livro %S adicionado com sucesso!\n", adicionarLivro);
				System.out.println("Aperte Enter para voltar ao Menu");
				ler.nextLine();
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("Lista dos livros:" + pilhaLivros);
				System.out.println("Aperte Enter para voltar ao Menu");
				ler.nextLine();
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("Qual livro deseja retirar da estante?");
				String retirarLivro = ler.nextLine();
				
				if( pilhaLivros.contains(retirarLivro)) {
					pilhaLivros.remove(retirarLivro);
					System.out.printf("Livro %S removido!\n", retirarLivro);
					System.out.println("Aperte Enter para voltar ao Menu");
					ler.nextLine();
				}else {
					System.out.println("Esse título não consta na estante para ser removido!");
					System.out.println("Aperte Enter para voltar ao Menu");
					ler.nextLine();
				}
				
			default:
				System.out.println("Programa encerrado, volte sempre e boa leitura!");
			}
			
		}while(op != 0);
	}
}
