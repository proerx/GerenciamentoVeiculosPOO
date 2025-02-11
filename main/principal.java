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
        
        sistema.adicionarVeiculo(new Carro("Ford", "Mustang", 2021, 15000, 10.0));
        sistema.adicionarVeiculo(new Moto("Yamaha", "MT-07", 2020, 12000, 22.0));
        sistema.adicionarVeiculo(new Caminhao("Mercedes", "Actros", 2019, 90000, 3.5));
        sistema.adicionarVeiculo(new CarroEletrico("Tesla", "Model X", 2023, 5000, 0, 380));

        sistema.listarVeiculos();
    }
     
}
