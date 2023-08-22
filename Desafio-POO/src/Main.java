import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Curso da dio.me", 72);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descricao", LocalDate.now());
        System.out.println(mentoria1);

    }
}
