package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //Atributos
    private LocalDate data;

    //metodo


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    //Getters and Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo ="  + getTitulo() +
                "descrição =" + getDescricao()+
                "data=" + data +
                '}';
    }
}