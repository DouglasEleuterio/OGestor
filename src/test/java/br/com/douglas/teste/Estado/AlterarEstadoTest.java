package br.com.douglas.teste.Estado;

import model.Estado;
import org.junit.Test;
import service.EstadoService;

public class AlterarEstadoTest {

    @Test
    public void RealizarTeste() {

        Estado estado = new Estado();
        alterarEstado(estado, 1L);

    }

    public static Estado buscarEstado(Object o, Long id) {
        EstadoService service = new EstadoService();
        Estado estado = new Estado();

        estado = service.buscarEstadoPorCodigo(estado, id);
        return estado;
    }

    public static void alterarEstado(Estado estado, Long codigo) {
        EstadoService service = new EstadoService();
        estado = buscarEstado(Estado.class, codigo);
        estado.setNome("Goiás");
        service.alterar(estado);
    }
}
