package br.com.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppTeste {
    public static void main(String[] args) {
        List<ListaNomes> listaPessoas = new ArrayList<>();
        listaPessoas.add(new ListaNomes("F", "Ana"));
        listaPessoas.add(new ListaNomes("F", "Maria"));
        listaPessoas.add(new ListaNomes("M", "Pedro"));
        listaPessoas.add(new ListaNomes("M", "Joao"));
        listaPessoas.add(new ListaNomes("F", "Daniela"));
        listaPessoas.add(new ListaNomes("F", "Ana Paula"));
        listaPessoas.add(new ListaNomes("M", "Guilherme"));
        listaPessoas.add(new ListaNomes("F", "Simone"));

        System.out.println("*** MULHERES ***");

        listaPessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("F"))
                .forEach(mulher -> {
                    System.out.println("Nome: " + mulher.getNome());
                    System.out.println("Genero: " + mulher.getGenero());
                    System.out.println();
                });
    }
}
