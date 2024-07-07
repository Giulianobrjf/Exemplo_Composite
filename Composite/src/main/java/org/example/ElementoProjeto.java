package org.example;

public abstract class ElementoProjeto {
    private String titulo;

    public ElementoProjeto(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String exibirDetalhes();
}
