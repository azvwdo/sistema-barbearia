
public class meuVetor {
    private Cliente[] clientes;
    private int tamanho;

    public meuVetor(int capacidade) {
        clientes = new Cliente[capacidade];
        tamanho = 0;
    }

    public boolean adicionar(Cliente cliente) {
        if (tamanho < clientes.length) {
            clientes[tamanho] = cliente;
            tamanho++;
            return true;
        }
        return false;
    }

    public Cliente buscarPorId(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (clientes[i].getId() == id) {
                return clientes[i];
            }
        }
        return null;
    }

    public boolean alterar(int id, String novoNome, String novoTelefone) {
        Cliente c = buscarPorId(id);
        if (c != null) {
            c.setNome(novoNome);
            c.setTelefone(novoTelefone);
            return true;
        }
        return false;
    }

    public boolean excluir(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (clientes[i].getId() == id) {
                for (int j = i; j < tamanho - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[tamanho - 1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public void listar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(clientes[i]);
        }
    }
}
