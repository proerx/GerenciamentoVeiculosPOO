package entidades;

public class Caminhao extends Veiculo {
    private double consumoCombustivel;;

    public Caminhao(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel) {
        super(marca, modelo, ano, quilometragem);
        this.consumoCombustivel = consumoCombustivel;
    }
    
    @Override
    public double calcularConsumo() {
        return consumoCombustivel;
    }

}
