package br.com.gof.facade;

import subsistema1.app.AppService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        AppService.gravarCliente(nome, cep, cidade, estado);
    }

}
