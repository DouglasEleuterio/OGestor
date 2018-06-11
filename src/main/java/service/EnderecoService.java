package service;

import DAO.CidadeDAO;
import DAO.EnderecoDAO;
import DAO.EstadoDAO;
import java.util.List;

import Util.DBException;
import model.Pessoa;
import java.sql.SQLException;
import model.Cidade;
import model.Estado;
import model.ENUMs.Regioes;
import model.Endereco;

public class EnderecoService {

    private EnderecoDAO enderecoDAO = new EnderecoDAO();
    Endereco endereco = new Endereco();
    public void salvar(Endereco endereco) throws SQLException, DBException {
        enderecoDAO.salvar(endereco);
    }

    public List<Endereco> ConsultarTodos() {
        return enderecoDAO.consultarTodos();
    }


    public void alterar(Endereco endereco) {
        enderecoDAO.alterar(endereco);
    }

//    public Cidade buscarCidadePorCodigo(Endereco endereco, Long id) {
//        endereco = enderecoDAO.buscaEstadoPorCodigo(endereco, id);
//        return endereco;
//    }

//    public Estado buscarCidadePorUF(String uf) {
//        Estado estado = new Estado();
//        estado = estadoDAO.buscarEstadoPorUF(uf);
//        return estado;
//    }
//
//    public Cidade buscarCidadePorNome(String nome) {
//        cidade = enderecoDAO.buscarCidadePorNome(nome);
//        return cidade;
//    }
}
