package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<String>();
        int opcao = -1;
        
        while(opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1: Adicionar um novo Cliente na fila.");
            System.out.println("2: Listar todos os Clientes na fila.");
            System.out.println("3: Chamar (retirar) uma pessoa da fila.");
            System.out.println("0: Sair do programa.");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nomeCliente = input.next();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 2:
                    if(filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila: ");
                        for(String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if(filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        String clienteChamado = filaClientes.remove();
                        System.out.println("Cliente " + clienteChamado + " chamado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        }
        input.close();
    }
}