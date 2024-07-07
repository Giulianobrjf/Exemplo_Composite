package org.example;

public class Tarefa extends ElementoProjeto {
    private String descricao;

    public Tarefa(String titulo, String descricao) {
        super(titulo);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCargaHoraria(String descricao) {
        this.descricao = descricao;
    }

    public String exibirDetalhes() {
        return "Tarefa: " + this.getTitulo() + " - Descrição: " + this.descricao + "\n";
    }

}
