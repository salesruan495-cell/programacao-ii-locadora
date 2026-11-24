
/*
 RegraNegocioException: exceção personalizada do sistema.
 
 É utilizada quando alguma regra do sistema não é cumprida, como CPF duplicado ou cliente não encontrado.
 Estende Exception, por isso quem utiliza essa exceção precisa tratar o erro com try/catch ou declarar throws.
 A mensagem informa o motivo do erro.

 ATENÇÃO: esta é uma versão provisória, criada por mim para permitir a compilação e os testes do cadastro de clientes.
 A responsabilidade por esta classe é da Pessoa 4 (Enzo), que pode alterá-la ou substituí-la.
 Caso o construtor seja alterado, avisar ao grupo para que o codigo que utiliza a excução seja atualizado.
 */
public class RegraNegocioException extends Exception{
    public RegraNegocioException(String mensagem) {
        super(mensagem);
    }  
}
