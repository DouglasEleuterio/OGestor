package service;

import DAO.CidadeDAO;
import DAO.EstadoDAO;
import java.util.List;

import Util.DBException;
import model.Pessoa;
import java.sql.SQLException;
import model.Cidade;
import model.Estado;
import model.ENUMs.Regioes;

public class CidadeService {

    private CidadeDAO cidadeDAO = new CidadeDAO();
    private Cidade cidade = new Cidade();

    public void salvar(Cidade cidade) throws SQLException, DBException {
        cidadeDAO.salvar(cidade);
    }

    public List<Cidade> ConsultarTodos() {
        return cidadeDAO.consultarTodos();
    }

    public List<Cidade> ConsultarPorEstado(Estado estado) {
        return cidadeDAO.consultarCidadesPorEstado(estado);
    }

    public void alterar(Cidade cidade) {
        cidadeDAO.alterar(cidade);
    }

    public Cidade buscarCidadePorCodigo(Cidade cidade, Long id) {
        cidade = cidadeDAO.buscaEstadoPorCodigo(cidade, id);
        return cidade;
    }

//    public Estado buscarCidadePorUF(String uf) {
//        Estado estado = new Estado();
//        estado = estadoDAO.buscarEstadoPorUF(uf);
//        return estado;
//    }
//
    public Cidade buscarCidadePorNome(String nome) {
        cidade = cidadeDAO.buscarCidadePorNome(nome);
        return cidade;
    }
}
