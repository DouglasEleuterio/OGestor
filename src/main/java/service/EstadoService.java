package service;

import DAO.EstadoDAO;
import java.util.List;

import Util.DBException;
import model.Pessoa;
import java.sql.SQLException;
import model.Estado;
import model.Regioes;

public class EstadoService {

    private EstadoDAO estadoDAO = new EstadoDAO();

    public void salvar(Estado estado) throws SQLException, DBException {
        estadoDAO.salvar(estado);
    }

    public List<Estado> ConsultarTodos() {
        return estadoDAO.consultarTodos();
    }
    
    public List<Estado> ConsultarPorRegiao(Regioes regioes) {
        return estadoDAO.consultarEstadosPorRegiao(regioes);
    }

    public void alterar(Estado estado) {
        estadoDAO.alterar(estado);
    }

    public Estado buscarEstadoPorCodigo(Estado estado, Long id) {
        estado = estadoDAO.buscaEstadoPorCodigo(estado, id);
        return estado;
    }

    public Estado buscarEstadoPorUF(String uf) {
        Estado estado = new Estado();
        estado = estadoDAO.buscarEstadoPorUF(uf);
        return estado;
    }

    public Estado buscarEstadoPorNome(String nome) {
        Estado estado = new Estado();
        estado = estadoDAO.buscarEstadoPorNome(nome);
        return estado;

    }

}
