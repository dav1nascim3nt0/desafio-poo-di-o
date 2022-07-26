package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO * CargaHoraria;
    }
    private int CargaHoraria;

    public Curso(){}

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }


}
