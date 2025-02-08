package entidades;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    
    public Veiculo(String marca, String modelo, int ano, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }
    
    public abstract double calcularConsumo();
    
    public void mostrar(){
        System.out.println("Veículo cadastrado: " + marca + " " + modelo);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public double getQuilometragem() {
        return quilometragem;
    }
    
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    
}