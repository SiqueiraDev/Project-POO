import java.util.ArrayList;
import java.util.List;

public class ClienteCRUD {
    private List<Cliente> clientes;

    public ClienteCRUD() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso.");
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - " + cliente.getCPF());
        }
    }

    public void atualizarCliente(String CPF, Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCPF().equals(CPF)) {
                clientes.set(i, clienteAtualizado);
                System.out.println("Cliente atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void removerCliente(String CPF) {
        clientes.removeIf(cliente -> cliente.getCPF().equals(CPF));
        System.out.println("Cliente removido com sucesso.");
    }
}
