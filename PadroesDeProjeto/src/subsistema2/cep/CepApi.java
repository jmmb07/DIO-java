package subsistema2.cep;

import br.com.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Catalão";
    }

    public String recuperarEstado(String cep) {
        return "GO";
    }

}
