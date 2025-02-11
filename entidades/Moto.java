package entidades;

public class Moto extends Veiculo {]
    private int cilindradas;
    private double consumoCombustivel;

    public Moto(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel, int cilindradas) {
        super(marca, modelo, ano, quilometragem);
        this.consumoCombustivel = consumoCombustivel;
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularConsumo() {
        return consumoCombustivel;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    
    public void exibirDetalhes() {
        System.out.println("Cilindradas: " + cilindradas);
    }
    
}
