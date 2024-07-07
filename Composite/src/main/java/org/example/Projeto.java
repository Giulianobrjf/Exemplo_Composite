package org.example;

public class Projeto {
    private ElementoProjeto roteiro;

    public void setRoteiro(ElementoProjeto roteiro) {
        this.roteiro = roteiro;
    }

    public String getRoteiro() {
        if (this.roteiro == null) {
            throw new NullPointerException("Projeto sem roteiro");
        }
        return this.roteiro.exibirDetalhes();
    }
}