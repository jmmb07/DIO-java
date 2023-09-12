package com.exemplo;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {

    private String imei;

    public Iphone(String imei) {
        this.imei = imei;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o seguinte numero:" + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo uma chamada");
    }

    @Override
    public void iniciarConversaVoz() {
        System.out.println("Iniciando conversa de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");

    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando uma bela musica: " + musica);

    }
}
