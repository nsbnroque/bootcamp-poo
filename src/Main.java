import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPessoa = new Dev();
        devPessoa.setNome("Fulaninho");
        System.out.println("Conteúdos inscritos: " + devPessoa.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devPessoa.getConteudosConcluidos());

        System.out.println("\n Depois da inscrição do Bootcamp: \n");

        devPessoa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devPessoa.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devPessoa.getConteudosConcluidos());


        devPessoa.progredir();

        System.out.println("\n Depois do uso do metodo progredir: \n");

        System.out.println("Conteúdos inscritos: " + devPessoa.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devPessoa.getConteudosConcluidos());
        System.out.println("Total XP: " + devPessoa.calcularTotalXP());





    }
}
