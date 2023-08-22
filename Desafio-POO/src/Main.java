import br.com.dio.desafio.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descr curso 1");
        curso1.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Python");
        mentoria1.setDescricao("descr mentoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp 01");
        bootcamp.setDescricao("Bootcamp de exemplo 1 - Curso1 + mentoria1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devW = new Dev();
        devW.setNome("Walter");
        System.out.println("\n-------------------------------\n... Inscricao ...\n-------------------------------\n");
        devW.inscreveBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos " + devW.getNome() + " - " + devW.getConteudosInscritos());
        System.out.println("Conteudo Concluidos " + devW.getNome() + " - " + devW.getConteudosConcluidos());
        System.out.println("XP " + devW.getNome() + " - " + devW.calcularTotalXp());
        System.out.println("\n-------------------------------\n... Walter Progredindo ...\n-------------------------------\n");
        devW.progredir();
        System.out.println("Conteudo Inscritos " + devW.getNome() + " - " + devW.getConteudosInscritos());
        System.out.println("Conteudo Concluidos " + devW.getNome() + " - " + devW.getConteudosConcluidos());
        System.out.println("XP " + devW.getNome() + " - " + devW.calcularTotalXp());
        System.out.println("\n-------------------------------\n... Walter Progredindo ...\n-------------------------------\n");
        devW.progredir();
        System.out.println("Conteudo Inscritos " + devW.getNome() + " - " + devW.getConteudosInscritos());
        System.out.println("Conteudo Concluidos " + devW.getNome() + " - " + devW.getConteudosConcluidos());
        System.out.println("XP " + devW.getNome() + " - " + devW.calcularTotalXp());
        System.out.println("\n-------------------------------\n... FIM ...\n-------------------------------\n");


    }
}
