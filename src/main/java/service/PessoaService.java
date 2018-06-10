package service;

import java.util.List;

import DAO.PessoaDAO;
import Util.DBException;
import model.Pessoa;
import java.sql.SQLException;

public class PessoaService {

    private PessoaDAO pessoaDAO = new PessoaDAO();

    public void salvar(Pessoa pessoa) throws SQLException, DBException{
        pessoa.setAtivo(true);
        pessoaDAO.salvar(pessoa);
    }

    public List<Pessoa> ConsultarTodos() {
        return pessoaDAO.consultarTodos();
    }

    public void alterar(Pessoa pessoa){
        pessoaDAO.alterar(pessoa);
    }
    
    public Pessoa buscarPessoaPorId(Pessoa pessoa, Long id){
        pessoa = pessoaDAO.buscaPessoaPorCodigo(pessoa, id);
        return pessoa;
    }
    
    public Pessoa buscarPessoaPorCPF(String cpf){
        Pessoa pessoa = new Pessoa();
        pessoa = pessoaDAO.buscarPessoaCPF(cpf);
        return pessoa;
   
    }
    
    public Pessoa buscarPessoaPorNomeUsuario(String nomeUsuario){
        Pessoa pessoa = new Pessoa();
        pessoa = pessoaDAO.buscarPessoaPorNomeUsuario(nomeUsuario);
        return pessoa;
   
    }
   
    public Pessoa buscarPessoaPorEmail(String email){
        Pessoa pessoa = new Pessoa();
        pessoa = pessoaDAO.buscarPessoaPorEmail(email);
        return pessoa;
   
    }
    
}
