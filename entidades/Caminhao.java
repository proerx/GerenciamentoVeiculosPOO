package entidades;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private double consumoCombustivel;;

    public Caminhao(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel, double capacidadeCarga) {
        super(marca, modelo, ano, quilometragem);
        this.consumoCombustivel = consumoCombustivel;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    @Override
    public double calcularConsumo() {
        return consumoCombustivel;
    }
    
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void exibirDetalhes() {
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
    
}
