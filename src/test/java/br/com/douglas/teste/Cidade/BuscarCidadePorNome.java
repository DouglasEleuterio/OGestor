package br.com.douglas.teste.Cidade;

import br.com.douglas.teste.Estado.*;
import model.Cidade;
import model.Estado;
import org.junit.Test;
import service.CidadeService;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class BuscarCidadePorNome {

     @Test
    public void RealizarTeste() {
        buscarCidadePorNome("Goiania");
    }

    public static Cidade buscarCidadePorNome(String nome) {
        Cidade cidade = new Cidade();
        CidadeService service = new CidadeService();
        cidade = service.buscarCidadePorNome(nome);
        imprimirResultados(cidade);
        return cidade;
    }

    public static void imprimirResultados(Cidade e) {
        if (e != null) {
            System.out.println("Imprimindo Resultados");
            System.out.println("Codigo: " + e.getCodigo());
            System.out.println("Nome: " + e.getNome());
            System.out.println("Estado: " + e.getEstado().getNome());
        }
    }

}
