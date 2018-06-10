/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.teste.Estado;

import DAO.EstadoDAO;
import Util.DBException;
import java.sql.SQLException;
import model.Estado;
import model.Regioes;
import org.junit.Test;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class InserirEstadoTest {

    Estado estado = new Estado();
    EstadoService service = new EstadoService();
    
    @Test
    public void salvarEstado() throws SQLException, DBException {
        estado.setNome("SAO PAULO");
        estado.setUf("SP");
        estado.setRegiao(Regioes.SUDESTE);
        service.salvar(estado);

    }

}
