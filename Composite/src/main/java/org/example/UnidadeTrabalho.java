package org.example;

import java.util.ArrayList;
import java.util.List;

public class UnidadeTrabalho extends ElementoProjeto{

    private List<ElementoProjeto> conteudos;

    public UnidadeTrabalho(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<ElementoProjeto>();
    }

    public void addConteudo(ElementoProjeto elementoProjeto) {
        this.conteudos.add(elementoProjeto);
    }

    public String exibirDetalhes() {
        String saida = "";
        saida = "Unidade: " + this.getTitulo() + "\n";
        for (ElementoProjeto elementoProjeto : conteudos) {
            saida += elementoProjeto.exibirDetalhes();
        }
        return saida;
    }
}
