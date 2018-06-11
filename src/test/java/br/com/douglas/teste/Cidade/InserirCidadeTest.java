/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.teste.Cidade;

import DAO.EstadoDAO;
import Util.DBException;
import java.sql.SQLException;
import model.Cidade;
import model.Estado;
import model.ENUMs.Regioes;
import org.junit.Test;
import service.CidadeService;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class InserirCidadeTest {

    @Test
    public void realizarTeste() throws SQLException, DBException {
        salvarCidade("Sao Paulo", "SP");
    }

    public static void salvarCidade(String nome, String uf) throws SQLException, DBException {
        Cidade cidade = new Cidade();
        CidadeService cidadeService = new CidadeService();
        Estado estado = new Estado();

        estado = buscaEstadoUF(uf);
        cidade.setNome(nome);
        cidade.setEstado(estado);
        cidadeService.salvar(cidade);
    }

    public static Estado buscaEstadoUF(String uf) {
        Estado estado = new Estado();
        EstadoService service = new EstadoService();
        estado = service.buscarEstadoPorUF(uf);
        return estado;
    }

}
