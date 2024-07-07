
import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjetoTest {

    @Test
    void deveRetornarRoteiroProjeto() {
        UnidadeTrabalho unidade1 = new UnidadeTrabalho("Investimento Gerencial");

        UnidadeTrabalho unidade2 = new UnidadeTrabalho("Correção Estrutural");
        Tarefa tarefa21 = new Tarefa("Levantamento de  obra","Fortalecimento das estruturas");
        unidade2.addConteudo(tarefa21);

        UnidadeTrabalho unidade3 = new UnidadeTrabalho("Revisão Co-Marca");
        Tarefa tarefa31 = new Tarefa("Contratação Funcionarios","Contratação de novos Colaboradores");
        Tarefa tarefa32 = new Tarefa("Demissão Funcionarios","Demissão de Funcionarios em baixo rendimento");
        unidade3.addConteudo(tarefa31);
        unidade3.addConteudo(tarefa32);

        UnidadeTrabalho roteiro = new UnidadeTrabalho("Re-estruturação Empresa");
        roteiro.addConteudo(unidade1);
        roteiro.addConteudo(unidade2);
        roteiro.addConteudo(unidade3);

        Projeto projeto = new Projeto();
        projeto.setRoteiro(roteiro);

        assertEquals("Unidade: Re-estruturação Empresa\n" +
                "Unidade: Investimento Gerencial\n" +
                "Unidade: Correção Estrutural\n" +
                "Tarefa: Levantamento de  obra - Descrição: Fortalecimento das estruturas\n" +
                "Unidade: Revisão Co-Marca\n" +
                "Tarefa: Contratação Funcionarios - Descrição: Contratação de novos Colaboradores\n" +
                "Tarefa: Demissão Funcionarios - Descrição: Demissão de Funcionarios em baixo rendimento\n", projeto.getRoteiro());
    }

    @Test
    void deveRetornarExecucaoProjetoSemRoteiro() {
        try {
            Projeto projeto = new Projeto();
            projeto.getRoteiro();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Projeto sem roteiro", e.getMessage());
        }
    }
}
