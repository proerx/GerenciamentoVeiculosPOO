package entidades;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, double quilometragem, boolean partidaEletrica) {
        super(marca, modelo, ano, quilometragem);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public double calcularConsumo() {
        return 30.0;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }
    
}