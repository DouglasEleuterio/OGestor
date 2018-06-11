package br.com.douglas.teste.Estado;

import model.Estado;
import org.junit.Test;
import service.EstadoService;

public class DeletarEstado {
        
    @Test
    public void realizarTeste(){
        deletarEstado("GO");
    }
    
    public static void deletarEstado(String uf){
        Estado estado = new Estado();
        EstadoService estadoService = new EstadoService();
        estadoService.deletarEstado(uf);
    }
    
}
