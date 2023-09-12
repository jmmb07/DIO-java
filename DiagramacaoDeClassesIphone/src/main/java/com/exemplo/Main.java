package com.exemplo;

public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone("1234");
        meuIPhone.getImei();

        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Hino do Corinthians");
        meuIPhone.pausar();

        meuIPhone.ligar("64-9-9988-4101");
        meuIPhone.atenderChamada();
        meuIPhone.iniciarConversaVoz();

        meuIPhone.exibirPagina("https://www.google.com.br");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
