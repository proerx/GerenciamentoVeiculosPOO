package entidades;

public class Carro extends Veiculo {
    private double consumoCombustivel;

    public Carro(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel) {
        super(marca, modelo, ano, quilometragem);
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public double calcularConsumo() {
        return 10.0;
    }

}
