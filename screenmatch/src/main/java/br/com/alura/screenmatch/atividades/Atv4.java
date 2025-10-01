package br.com.alura.screenmatch.atividades;

import java.util.Arrays;
import java.util.List;

public class Atv4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "maça", "apple", "banana");

        words.stream().distinct().forEach(System.out::println);
    }
}
