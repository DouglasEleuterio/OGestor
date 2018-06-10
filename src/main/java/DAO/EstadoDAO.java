/*
 * Operações do Objeto estado no banco de dados.
 */
package DAO;

import Util.DBException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import model.Estado;
import model.Pessoa;

/**
 *
 * @author douglas
 */
public class EstadoDAO extends SuperDAO{
    
    public void salvar(Estado estado) throws SQLException, DBException {
        EntityManager em = super.getConetion();
        em.getTransaction().begin();
        em.persist(estado);
        em.getTransaction().commit();
        em.close();
    }

    public List<Estado> consultarTodos() {
        return em.createQuery("from Estado").getResultList();
    }

    public void deletar(Estado estado) {
        em.getTransaction().begin();
        em.remove(estado);
        em.getTransaction().commit();
        em.close();
    }

    public void alterar(Estado estado) {
        em.getTransaction().begin();
        em.merge(estado);
        em.getTransaction().commit();
        em.close();
    }

    public Estado buscaEstadoPorCodigo(Estado estado, Long id) {
        estado = em.find(Estado.class, id);
        return estado;
    }

    public Estado buscarEstadoPorUF(String uf) {
        return em.createQuery("SELECT p from Estado p WHERE p.uf = :uf", Estado.class)
                .setParameter("uf", uf).getSingleResult();
    }

    public Estado buscarEstadoPorNome(String nome) {
        return em.createQuery("SELECT e from Estado e WHERE e.nome = :nome", Estado.class)
                .setParameter("nome", nome).getSingleResult();
    }

    /**
     * Implementar a busca de  Estado por Região.
     * @param email
     * @return 
     */
    public Pessoa buscarPessoaPorEmail(String email) {
        return em.createQuery("SELECT p from Pessoa p WHERE p.email = :email", Pessoa.class)
                .setParameter("email", email).getSingleResult();
    }
}
