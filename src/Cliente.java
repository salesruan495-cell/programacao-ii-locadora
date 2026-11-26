/* Classe que representa um cliente da locadora 
  Guarda o id, nome e CPF em atributos private, protegendo os dados.
  O construtor verifica os dados antes de criar o cliente: o nome não pode estar vazio e o CPF precisa ter 11 números.
  Se algum dado estiver incorreto, lança RegraNegocioException.
  O CPF é armazenado como String para não perder zeros à esquerda.
 Possui apenas getters, sem setters, permitindo consultar os dados sem modificá-los depois da criação.
*/

public class Cliente { 
    private int id;
    private String nome;
    private String cpf;

    public Cliente( int id, String nome, String cpf) 
        throws RegraNegocioException {

        if ( nome == null || nome.trim().isEmpty()) {
            throw new RegraNegocioException("O nome informado pelo cliente não pode ser vazio.");

        }
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new RegraNegocioException("O CPF informado pelo cliente não é válido. Deve conter 11 dígitos numéricos.");

        }
        this.id = id;
        this.nome = nome.trim();
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente #" + id + "-" + nome + " (CPF: " + cpf + ")";
    }

}
