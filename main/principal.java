package main;

import entidades.*;
import java.util.List;
import java.util.ArrayList;

public class principal {
    private List<Veiculo> frota;

    public SistemaGerenciamentoVeiculos() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : frota) {
            System.out.println(veiculo.getMarca() + " " + veiculo.getModelo() + " - Ano: " + veiculo.getAno());
        }
    }

    public static void main(String[] args) {
        SistemaGerenciamentoVeiculos sistema = new SistemaGerenciamentoVeiculos();
        
        sistema.adicionarVeiculo(new Carro("Toyota", "Corolla", 2020, 50000, 12.5));
        sistema.adicionarVeiculo(new Moto("Honda", "CB500", 2019, 30000, 25.0));
        sistema.adicionarVeiculo(new Caminhao("Volvo", "FH", 2018, 80000, 4.0));
        sistema.adicionarVeiculo(new CarroEletrico("Tesla", "Model 3", 2022, 10000, 0, 400));

        sistema.listarVeiculos();
    }
}
