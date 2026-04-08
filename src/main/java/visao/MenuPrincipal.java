package visao;

import java.util.Scanner;
import negocio.GerenciadorMedicamentos;
import negocio.Medicamento;

public class MenuPrincipal {
    private GerenciadorMedicamentos gerenciador = new GerenciadorMedicamentos();
    private Scanner scanner = new Scanner(System.in);

    public void exibir() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MONITOR DE ADESÃO ---");
            System.out.println("1. Cadastrar Medicamento");
            System.out.println("2. Ver Minha Rotina");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1 -> cadastrar();
                    case 2 -> listar();
                    case 0 -> System.out.println("Até logo!");
                    default -> System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private void cadastrar() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Dose: ");
        String dose = scanner.nextLine();
        System.out.print("Hora (HH:mm): ");
        String hora = scanner.nextLine();

        Medicamento m = new Medicamento(nome, dose, hora);
        gerenciador.adicionar(m);
        System.out.println("Cadastrado com sucesso!");
    }

    private void listar() {
        var lista = gerenciador.listarTodos();
        if (lista.isEmpty()) {
            System.out.println("Nenhum medicamento agendado.");
        } else {
            lista.forEach(System.out::println);
        }
    }
}