package main;

import entidades.*;
import java.util.List;
import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();
        
        Carro carro = new Carro("Toyota", "Corolla", 2020, 15000, 4);
        Moto moto = new Moto("Honda", "CB 500", 2019, 10000, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2018, 50000, 10000);
        
        frota.add(carro);
        frota.add(moto);
        frota.add(caminhao);
        
        for (Veiculo veiculo : frota){
            veiculo.mostrar();
            System.out.println("Consumo " + veiculo.calcularConsumo());
        }

        System.out.println("\nFim do programa!");
    }
}