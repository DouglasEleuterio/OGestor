package br.com.douglas.teste.Cidade;

import br.com.douglas.teste.Estado.*;
import model.Cidade;
import model.Estado;
import org.junit.Test;
import service.CidadeService;
import service.EstadoService;

public class AlterarCidadeTest {

    @Test
    public void RealizarTeste() {
        Estado estado = new Estado();
        alterarCidade("Goiania","Goiania");
    }

    public static Cidade buscarCidade(String nome) {
        Cidade cidade = new Cidade();
        CidadeService service = new CidadeService();
        cidade = service.buscarCidadePorNome(nome);
        return cidade;
    }

    public static void alterarCidade(String nomeBusca, String nomeAlterado) {
        Cidade cidade = new Cidade();
        CidadeService service = new CidadeService();
        cidade = buscarCidade(nomeBusca);
        cidade.setNome(nomeAlterado);
        service.alterar(cidade);
    }
}
