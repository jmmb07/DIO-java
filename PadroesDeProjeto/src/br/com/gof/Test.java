package br.com.gof;

import br.com.gof.facade.Facade;
import br.com.gof.singleton.SingletonLazy;
import br.com.gof.strategy.*;

public class Test {

    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("JoaoM", "75757777");

    }

}
