package main;

import entidades.*;
import java.util.List;
import java.uil.Scanner;
import java.util.ArrayList;

public class principal {
    private List<Veiculo> frota;
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Cadastrar Carro");
        System.out.println("2. Cadastrar Moto");
        System.out.println("3. Cadastrar Caminhão");
        System.out.println("4. Consultar Frota");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Marca do carro: ");
                String marcaCarro = scanner.nextLine();
                System.out.print("Modelo do carro: ");
                String modeloCarro = scanner.nextLine();
                System.out.print("Ano do carro: ");
                int anoCarro = scanner.nextInt();
                System.out.print("Quilometragem do carro: ");
                double quilometragemCarro = scanner.nextDouble();
                System.out.print("Tem ar-condicionado? (true/false): ");
                boolean temArCondicionado = scanner.nextBoolean();

                Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, quilometragemCarro, temArCondicionado);
                frota.add(carro);
                System.out.println("Carro cadastrado com sucesso!");
                break;

            case 2:
                System.out.print("Marca da moto: ");
                String marcaMoto = scanner.nextLine();
                System.out.print("Modelo da moto: ");
                String modeloMoto = scanner.nextLine();
                System.out.print("Ano da moto: ");
                int anoMoto = scanner.nextInt();
                System.out.print("Quilometragem da moto: ");
                double quilometragemMoto = scanner.nextDouble();
                System.out.print("Cilindradas da moto: ");
                int cilindradas = scanner.nextInt();

                Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, quilometragemMoto, cilindradas);
                frota.add(moto);
                System.out.println("Moto cadastrada com sucesso!");
                break;

            case 3:
                System.out.print("Marca do caminhão: ");
                String marcaCaminhao = scanner.nextLine();
                System.out.print("Modelo do caminhão: ");
                String modeloCaminhao = scanner.nextLine();
                System.out.print("Ano do caminhão: ");
                int anoCaminhao = scanner.nextInt();
                System.out.print("Quilometragem do caminhão: ");
                double quilometragemCaminhao = scanner.nextDouble();
                System.out.print("Capacidade de carga (toneladas): ");
                double capacidadeCarga = scanner.nextDouble();

                Caminhao caminhao = new Caminhao(marcaCaminhao, modeloCaminhao, anoCaminhao, quilometragemCaminhao, capacidadeCarga);
                frota.add(caminhao);
                System.out.println("Caminhão cadastrado com sucesso!");
                break;

            case 4:
                System.out.println("\n--- Frota de Veículos ---");
                for (Veiculo veiculo : frota) {
                    System.out.println("\nMarca: " + veiculo.getMarca());
                    System.out.println("Modelo: " + veiculo.getModelo());
                    System.out.println("Ano: " + veiculo.getAno());
                    System.out.println("Quilometragem: " + veiculo.getQuilometragem());

                    if (veiculo instanceof Carro) {
                        ((Carro) veiculo).exibirDetalhes();
                    } else if (veiculo instanceof Moto) {
                        ((Moto) veiculo).exibirDetalhes();
                    } else if (veiculo instanceof Caminhao) {
                        ((Caminhao) veiculo).exibirDetalhes();
                    }
                }
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");

        }
    } while (opcao != 0);

    scanner.close();   

}
