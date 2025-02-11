package entidades;

public class Moto extends Veiculo {
    private double consumoCombustivel;

    public Moto(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel) {
        super(marca, modelo, ano, quilometragem);
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public double calcularConsumo() {
        return consumoCombustivel;
    }
     
}
