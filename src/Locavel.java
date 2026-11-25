/**
 * Define o que qualquer coisa que pode ser alugada precisa saber fazer.
 * Hoje só os veículos usam essa interface, mas o sistema de locação
 * pode trabalhar só com ela, sem precisar saber se é carro ou moto.
 */
public interface Locavel {

    /** Valor Total da locação conforme os dias */
    double calcularValorLocacao(int dias) throws RegraNegocioException;

    /** Diz se o item pode ser alugado */
    boolean isDisponivel();

    /** Marca o item como locado. Se estiver locado, é recusado */
    void marcarComoLocado() throws RegraNegocioException;

    /** Marca o item como disponivel novamente. Se não estiver locado, recusa */
    void marcarComoDisponivel() throws RegraNegocioException;

}