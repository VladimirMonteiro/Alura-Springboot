package br.com.alura.screenmatch.services;

public interface IcoverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
