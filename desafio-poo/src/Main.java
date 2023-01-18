import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp1);

        Dev dev2 = new Dev();
        dev2.setNome("Ricardo");
        dev2.inscreverBootcamp(bootcamp1);


        System.out.println("Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("----");

        dev1.progredir();
        System.out.println("Concluidos " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("----");

        dev1.progredir();
        System.out.println("Concluidos " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("----");

        dev1.progredir();
        System.out.println("Concluidos " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("----");

        dev1.progredir();
        System.out.println("XP Camila: " + dev1.calcularTotalXp());

        System.out.println("----");

        System.out.println("Inscritos " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("----");
        
        dev2.progredir();
        System.out.println("Concluidos " + dev2.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("----");
        
        dev2.progredir();
        System.out.println("Concluidos " + dev2.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("----");

        System.out.println("XP Ricardo: " + dev2.calcularTotalXp());
    }

}