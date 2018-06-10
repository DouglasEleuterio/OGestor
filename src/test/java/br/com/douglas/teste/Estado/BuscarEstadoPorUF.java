package br.com.douglas.teste.Estado;

import model.Estado;
import org.junit.Test;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class BuscarEstadoPorUF {

     @Test
    public void RealizarTeste() {
        buscarEstadoPorUF("GO");
    }

    public static Estado buscarEstadoPorUF(String uf) {
        Estado estado = new Estado();
        EstadoService service = new EstadoService();
        estado = service.buscarEstadoPorUF(uf);
        imprimirResultados(estado);
        return estado;
    }

    public static void imprimirResultados(Estado e) {
        if (e != null) {
            System.out.println("Imprimindo Resultados");
            System.out.println("Codigo: " + e.getCodigo());
            System.out.println("Nome: " + e.getNome());
            System.out.println("UF: " + e.getUf());
        }
    }

}
                      