/* Explicação detalhada
 * RepositorioClientes: guarda e consulta os clientes da locadora (RF02).
Funcionamento: 
   Os clientes ficam numa lista (ArrayList) dentro da própria classe.
cadastrar(): recusa CPF repetido e cria o Cliente. O id é gerado automaticamente (1, 2, 3...) e só aumenta quando o cadastro é realizado;
 buscarPorCpf(): procura um cliente pelo CPF. Retorna o cliente encontrado ou null se não existir.
  buscarPorId(): procura um cliente pelo ID. Se não encontrar, lança RegraNegocioException.
   listar(): retorna uma cópia da lista de clientes, evitando que alterações externas modifiquem a lista original.
Usa: Cliente e RegraNegocioException.
*/


import java.util.ArrayList;
import java.util.List;
public class RepositorioClientes {
    private List<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    public Cliente cadastrar(String nome, String cpf)
            throws RegraNegocioException {

        if (buscarPorCpf(cpf) != null) {
            throw new RegraNegocioException(
                "Já existe um cliente com esse CPF.");
        }

        Cliente c = new Cliente(proximoId, nome, cpf);

        clientes.add(c);
        proximoId++;

        return c;
    }

    public Cliente buscarPorCpf(String cpf) {

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {

                return c;
            }
        }

        return null;
    }

    public Cliente buscarPorId(int id) throws RegraNegocioException {

        for (Cliente c : clientes) {
            if (c.getId() == id) {

                return c;
            }
        }

        throw new RegraNegocioException("Cliente não encontrado.");
    }

    public List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }
}

