import java.time.LocalDate;

public class Locacao {
    private static int contadorId = 1;
    
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private double valorTotal;
    private boolean ativa;

    public Locacao(Cliente cliente, Veiculo veiculo, int dias) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
        this.dataInicio = LocalDate.now();
        this.valorTotal = veiculo.getValorDiaria() * dias; 
        this.ativa = true;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getDias() {
        return dias;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void finalizarLocacao() {
        this.ativa = false;
        this.dataDevolucao = LocalDate.now();
    }

    @Override
    public String toString() {
        String status = ativa ? "Ativa" : "Finalizada em " + dataDevolucao;
        return String.format("Locação #%d | Cliente: %s | Veículo: %s | Dias: %d | Total: R$ %.2f | Status: %s",
                id, cliente.getNome(), veiculo.getModelo(), dias, valorTotal, status);
    }
}
