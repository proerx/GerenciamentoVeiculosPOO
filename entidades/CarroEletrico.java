package entidades;

public class CarroEletrico extends Carro implements VeiculoEletrico {
    private double autonomia;
    
    public CarroEletrico(String marca, String modelo, int ano, double quilometragem, double consumoCombustivel, double autonomia) {
        super(marca, modelo, ano, quilometragem, consumoCombustivel);
        this.autonomia = autonomia;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Bateria carregada!");
    }

    @Override
    public double getAutonomia() {
        return autonomia;
    }
    
}
