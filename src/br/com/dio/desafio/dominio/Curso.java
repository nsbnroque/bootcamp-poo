package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos
    private int cargaHoraria;

    //metodo


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    //Getters and Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo ="  + getTitulo() +
                "descrição =" + getDescricao()+
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
