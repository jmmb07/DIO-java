package br.com.dio.gof.padroesprojetospring.services;

import br.com.dio.gof.padroesprojetospring.models.Client;

public interface ClientService {

    Iterable<Client> buscarTodos();

    Client buscarPorId(Long id);

    void inserir(Client cliente);

    void atualizar(Long id, Client cliente);

    void deletar(Long id);

}