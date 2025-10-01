package br.com.alura.screenmatch.atividades;

import java.util.Arrays;
import java.util.List;

public class At2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");

        words.stream().map(w -> w.toUpperCase()).forEach(System.out::println);
    }
}
