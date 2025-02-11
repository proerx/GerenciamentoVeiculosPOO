package entidades;

public class Carro extends Veiculo {
    private boolean temArCondicionado;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel, boolean temArCondicionado) {
        super(marca, modelo, ano, quilometragem);
        this.consumoCombustivel = consumoCombustivel;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public double calcularConsumo() {
        return 10.0;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void exibirDetalhes() {
        System.out.println("Tem ar-condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }

}
