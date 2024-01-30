package br.com.dio.gof.padroesprojetospring.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.gof.padroesprojetospring.models.Client;
import br.com.dio.gof.padroesprojetospring.models.ClientRepository;
import br.com.dio.gof.padroesprojetospring.models.Endereco;
import br.com.dio.gof.padroesprojetospring.models.EnderecoRepository;
import br.com.dio.gof.padroesprojetospring.services.ClientService;
import br.com.dio.gof.padroesprojetospring.services.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Client> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Client buscarPorId(Long id) {
        Optional<Client> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Client cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Client cliente) {
        Optional<Client> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Client cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}