package br.com.alura.screenmatch.atividades;

import java.util.Arrays;
import java.util.List;

public class Atv1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
