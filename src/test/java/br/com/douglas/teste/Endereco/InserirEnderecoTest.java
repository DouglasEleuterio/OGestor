/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.douglas.teste.Endereco;

import br.com.douglas.teste.Cidade.*;
import DAO.EstadoDAO;
import Util.DBException;
import java.sql.SQLException;
import model.Cidade;
import model.ENUMs.LogradouroTipo;
import model.Estado;
import model.ENUMs.Regioes;
import model.Endereco;
import org.junit.Test;
import service.CidadeService;
import service.EnderecoService;
import service.EstadoService;

/**
 *
 * @author douglas
 */
public class InserirEnderecoTest {

    @Test
    public void realizarTeste() throws SQLException, DBException {
        Endereco endereco = new Endereco();
        Cidade cidade = buscaCidadePorNome("Goiania");
        
        //cidade = (Cidade) cidadeService.buscarCidadePorNome("Goiania");
        System.out.println(cidade.getNome());
        endereco.setLogradouroTipo(LogradouroTipo.RUA);
        endereco.setLogradouro("12");
        endereco.setComplemento("Qd 22 LT 05 Res. Candido de Queiroz");
        endereco.setNumero("S/N");
        endereco.setCidade(cidade);
        salvarEndereco(endereco);
    }

    public static void salvarEndereco(Endereco endereco) throws SQLException, DBException {
        EnderecoService service = new EnderecoService();
//        endereco.setLogradouroTipo(tipoLogradouro);
//        endereco.setLogradouro(logradouro);
//        endereco.setNumero(numero);
//        endereco.setComplemento(complemento);
        //endereco.setCidade(cidade);
        service.salvar(endereco);
        
    }

    public static Cidade buscaCidadePorNome(String nome) {
        Cidade cidade = new Cidade();
        CidadeService cidadeService = new CidadeService();
        cidade = cidadeService.buscarCidadePorNome(nome);
        return cidade;
    }

}
