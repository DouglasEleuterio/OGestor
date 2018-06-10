package br.com.douglas.teste.Estado;

import model.Estado;
import org.junit.Test;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class BuscarEstadoPorNome {

     @Test
    public void RealizarTeste() {
        buscarEstadoPorNome("GOIAS");
    }

    public static Estado buscarEstadoPorNome(String nome) {
        Estado estado = new Estado();
        EstadoService service = new EstadoService();
        estado = service.buscarEstadoPorNome(nome);
        imprimirResultados(estado);
        return estado;
    }

    public static void imprimirResultados(Estado e) {
        if (e != null) {
            System.out.println("Imprimindo Resultados");
            System.out.println("Codigo: " + e.getCodigo());
            System.out.println("NOme: " + e.getNome());
            System.out.println("CPF: " + e.getUf());
        }
    }

}
