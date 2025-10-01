package br.com.alura.screenmatch.atividades;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Atv3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List filtredsNumbers = numbers.stream()
        .filter(n -> n % 2 != 0)
        .map(n -> n * 2)
        .collect(Collectors.toList());

        filtredsNumbers.forEach(System.out::println);


    }
}
