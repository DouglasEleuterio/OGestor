package DAO;

import Util.DBException;
import java.util.List;

import model.Pessoa;
import java.sql.SQLException;
import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class PessoaDAO extends SuperDAO {

    public void salvar(Pessoa pessoa) throws SQLException, DBException {
        EntityManager em = super.getConetion();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
        System.out.println(em.isOpen() ? "Resultado Final = Aberto" : "Resultado Final = Fechado");
    }

    public List<Pessoa> consultarTodos() {
        return em.createQuery("from Pessoa").getResultList();
    }

    public void deletar(Pessoa pessoa) {
        em.getTransaction().begin();
        em.remove(pessoa);
        em.getTransaction().commit();
        em.close();
        System.out.println(em.isOpen() ? "Aberto": "Fechado");
    }

    public void alterar(Pessoa pessoa) {
        em.getTransaction().begin();
        em.merge(pessoa);
        em.getTransaction().commit();
        em.close();
        System.out.println(em.isOpen() ? "Aberto": "Fechado");
    }

    public Pessoa buscaPessoaPorCodigo(Pessoa pessoa, Long id) {
        pessoa = em.find(Pessoa.class, id);
        
        //Checando se o Entity manager esta fechado ou aberto
        System.out.println(em.isOpen() ? "Aberto": "Fechado");
        return pessoa;
    }

    public Pessoa buscarPessoaCPF(String cpf) {
        return em.createQuery("SELECT p from Pessoa p WHERE p.cpf = :cpf", Pessoa.class)
                .setParameter("cpf", cpf).getSingleResult();
    }

    public Pessoa buscarPessoaPorNomeUsuario(String nomeUsuario) {
        return em.createQuery("SELECT p from Pessoa p WHERE p.nomeUsuario = :nomeusuario", Pessoa.class)
                .setParameter("nomeusuario", nomeUsuario).getSingleResult();
    }

    public Pessoa buscarPessoaPorEmail(String email) {
        return em.createQuery("SELECT p from Pessoa p WHERE p.email = :email", Pessoa.class)
                .setParameter("email", email).getSingleResult();
    }
}
