import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    private static ClienteCRUD clienteCRUD = new ClienteCRUD();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        while (true) {
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Atualizar Cliente");
            System.out.println("4. Remover Cliente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    atualizarCliente();
                    break;
                case 4:
                    removerCliente();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarCliente() throws ParseException {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String CPF = scanner.nextLine();
        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        Date dataDeNascimento = sdf.parse(scanner.nextLine());
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, CPF, dataDeNascimento, endereco, telefone, email);
        clienteCRUD.adicionarCliente(cliente);
    }

    private static void listarClientes() {
        clienteCRUD.listarClientes();
    }

    private static void atualizarCliente() throws ParseException {
        System.out.print("CPF do cliente a ser atualizado: ");
        String CPF = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        Date dataDeNascimento = sdf.parse(scanner.nextLine());
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente clienteAtualizado = new Cliente(nome, CPF, dataDeNascimento, endereco, telefone, email);
        clienteCRUD.atualizarCliente(CPF, clienteAtualizado);
    }

    private static void removerCliente() {
        System.out.print("CPF do cliente a ser removido: ");
        String CPF = scanner.nextLine();
        clienteCRUD.removerCliente(CPF);
    }
}
