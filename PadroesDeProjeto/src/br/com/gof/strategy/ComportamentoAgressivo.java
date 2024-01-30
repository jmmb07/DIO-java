package br.com.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo Agressivo");
    }
}
