/*Veiculo: classe base para Carro e Moto.
Guarda o que os dois têm em comum: placa, marca, modelo, valor da diaria e se 
o veiculo está disponível. 
Ela implementa Locavel, mas não calcula valor da locação. Isso fica para Carro e Moto, 
e cada um tem suas regras.
A placa duplicada é verificada no cadastro.*/

public abstract class Veiculo implements Locavel {
    private String placa;
    private String marca;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel;

    public Veiculo(String placa, String marca, String modelo, double valorDiaria)
            throws RegraNegocioException {

        if (placa == null || placa.trim().isEmpty()) {
            throw new RegraNegocioException("A placa não pode ficar vazia.");
        }
        if (marca == null || marca.trim().isEmpty()) {
            throw new RegraNegocioException("A marca não pode ficar vazia.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new RegraNegocioException("O modelo não pode ficar vazio.");
        }
        if (valorDiaria <= 0) {
            throw new RegraNegocioException("A diária precisa ser maior que zero.");
        }
        this.placa = placa.trim().toUpperCase();
        this.marca = marca.trim();
        this.modelo = modelo.trim();
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public void marcarComoLocado() throws RegraNegocioException {
        if (!disponivel) {
            throw new RegraNegocioException("O veículo de placa " + placa + " já está locado.");
        }
        disponivel = false;
    }

    @Override
    public void marcarComoDisponivel() throws RegraNegocioException {
        if (disponivel) {
            throw new RegraNegocioException("O veículo de placa " + placa + " não está locado.");
        }
        disponivel = true;
    }

    // Usado por Carro e Moto para validar os dias antes de calcular o valor.
    protected void validarDias(int dias) throws RegraNegocioException {
        if (dias <= 0) {
            throw new RegraNegocioException("A quantidade de dias precisa ser maior que zero.");
        }
    }
}