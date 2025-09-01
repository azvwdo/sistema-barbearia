import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        meuVetor vetor = new meuVetor(1000); 

        int opcao;
        do {
            System.out.println("\nMINHA BARBEARIA");

            System.out.print("\nEscolha uma das opções abaixo: ");
            
            System.out.println("\n1. Cadastrar cliente");
            
            System.out.println("2. Listar clientes");
            
            System.out.println("3. Buscarr cliente");
            
            System.out.println("4. Alterar cliente");
            
            System.out.println("5. Excluir cliente");
            
            System.out.println("0. Sair");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                    case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String tel = scanner.nextLine();
                    Cliente c = new Cliente(id, nome, tel);
                    if (vetor.adicionar(c)) {
                        System.out.println("Cliente adicionado com sucesso!");
                    } else {
                        System.out.println("Erro: Limite de clientes atingido.");
                    }
                    break;

                    case 2:
                    vetor.listar();
                    break;

                    case 3:
                    System.out.print("Digite o ID: ");
                    int buscanneraId = scanner.nextInt();
                    Cliente encontrado = vetor.buscarPorId(buscanneraId);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                    case 4:
                    System.out.print("ID do cliente: ");
                    int altId = scanner.nextInt(); scanner.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Novo telefone: ");
                    String novoTel = scanner.nextLine();

                    if (vetor.alterar(altId, novoNome, novoTel)) {
                        System.out.println("Cliente alterado com sucesso.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                   case 5:
                    System.out.print("ID do cliente a excluir: ");
                    int excId = scanner.nextInt();
                    if (vetor.excluir(excId)) {
                        System.out.println("Cliente excluído.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                    case 0:

                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
