package entidades;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double quilometragem, int numeroPortas) {
        super(marca, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularConsumo() {
        return 10.0;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    
}