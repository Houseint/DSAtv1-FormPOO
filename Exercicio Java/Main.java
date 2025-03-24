import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int op;

        do {
            System.out.println("\nMenu:");
            System.out.println("1- Cadastrar uma nova pessoa");
            System.out.println("2- Editar dados de uma pessoa cadastrada");
            System.out.println("3- Apresentar dados de uma pessoa cadastrada");
            System.out.println("4- Excluir dados de uma pessoa cadastrada");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");

            
          
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Cadastrar uma nova pessoa:");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    pessoa.setnome(nome);
                    pessoa.setidade(idade);
                    pessoa.setemail(email);

                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println("Editar dados de uma pessoa cadastrada:");
                    System.out.print("Digite o novo nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Digite a nova idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer, isso evita de dar erros :( DEU MUITOS ERROS SABIA
                    System.out.print("Digite o novo email: ");
                    email = scanner.nextLine();

                    pessoa.setnome(nome);
                    pessoa.setidade(idade);
                    pessoa.setemail(email);

                    System.out.println("Dados atualizados com sucesso!");
                    break;

                case 3:
                    System.out.println("Dados da pessoa cadastrada:");
                    System.out.println("Nome: " + pessoa.getnome());
                    System.out.println("Idade: " + pessoa.getidade());
                    System.out.println("Email: " + pessoa.getemail());
                    break;

                case 4:
                    pessoa = null;
                    System.out.println("Dados da pessoa excluídos.");
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 5);

        scanner.close();
    }
}

// o valor de op e os buffer do scanner estavam errados que sofrimento professor eu sofri.  
