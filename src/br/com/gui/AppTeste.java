package br.com.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ListaNomes> pessoas = new ArrayList<>();

        System.out.println("Insira as informações no formato 'Nome - Gênero (M/F)' ou digite 'parar' para encerrar.");

        while (true) {
            String entrada = scanner.nextLine().trim();
            if ("parar".equalsIgnoreCase(entrada)) {
                break;
            }
            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim().toUpperCase();
                String genero = partes[1].trim().toUpperCase();
                pessoas.add(new ListaNomes(genero, nome));
            } else {
                System.out.println("Formato inválido! Por favor, insira no formato 'Nome - Gênero(M/F)'.");
            }
        }
        System.out.println("\nLista de pessoas inseridas com seu respectivo gênero:");
        for (ListaNomes pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getGenero());
        }
        System.out.println("\nLista de pessoas do gênero feminino:");
        List<ListaNomes> result = pessoas.stream()
                .filter(listaNomes -> listaNomes.getGenero().equals("F"))
                .collect(Collectors.toList());
        result.forEach(listaNomes -> System.out.println(listaNomes.getNome()));

    }
}
