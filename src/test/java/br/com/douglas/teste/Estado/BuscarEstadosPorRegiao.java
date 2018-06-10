package br.com.douglas.teste.Estado;

import java.util.List;
import model.Estado;
import model.Regioes;
import org.junit.Test;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class BuscarEstadosPorRegiao {

     @Test
    public void RealizarTeste() {
        buscarEstadoPorRegiao(Regioes.SUDESTE);
    }

    public static List<Estado> buscarEstadoPorRegiao(Regioes regioes) {
        EstadoService service = new EstadoService();
        List<Estado> estados = service.ConsultarPorRegiao(regioes);
        return estados;
    }

    public static void imprimirResultados(Estado e) {
        
    }

}
