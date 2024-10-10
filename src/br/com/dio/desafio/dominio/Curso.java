package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{



    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    public Curso() {}

    @Override
    public String toString() {
        return  "\n" +"---------------CURSO---------------" + "\n" +
                "Titulo: " + getTitulo() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Carga Horaria= " + getCargaHoraria() + "\n" +
                "-----------------------------------" + "\n";
    }
}
