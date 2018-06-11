/*
 * Operações do Objeto estado no banco de dados.
 */
package DAO;

import Util.DBException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import model.Cidade;
import model.Estado;
import model.Pessoa;
import model.ENUMs.Regioes;

/**
 *
 * @author douglas
 */
public class CidadeDAO extends SuperDAO {

    public void salvar(Cidade cidade) throws SQLException, DBException {
        EntityManager em = super.getConetion();
        em.getTransaction().begin();
        em.persist(cidade);
        em.getTransaction().commit();
        em.close();
    }

    public List<Cidade> consultarTodos() {
        return em.createQuery("from Cidade").getResultList();
    }

    public void deletar(Cidade cidade) {
        em.getTransaction().begin();
        em.remove(cidade);
        em.getTransaction().commit();
        em.close();
    }

    public void alterar(Cidade cidade) {
        em.getTransaction().begin();
        em.merge(cidade);
        em.getTransaction().commit();
        em.close();
    }

    public Cidade buscaEstadoPorCodigo(Cidade cidade, Long id) {
        cidade = em.find(Cidade.class, id);
        return cidade;
    }

    public List<Cidade> consultarCidadesPorEstado(Estado estado) {
        return em.createQuery("SELECT c from Cidade as c WHERE c.estado = :estado")
                .setParameter("estado", estado).getResultList();
    }

    public List<Cidade> buscarCidadePorUF(String uf) {
        return em.createQuery("SELECT c from Cidade c WHERE c.estado.uf = :uf", Cidade.class)
                .setParameter("uf", uf).getResultList();
    }

    public Cidade buscarCidadePorNome(String nome) {
        return em.createQuery("SELECT c from Cidade c WHERE c.nome = :nome", Cidade.class)
                .setParameter("nome", nome).getSingleResult();
    }

    /**
     * Implementar a busca de Estado por Região.
     *
     * @param email
     * @return
     */
    public Pessoa buscarPessoaPorEmail(String email) {
        return em.createQuery("SELECT p from Pessoa p WHERE p.email = :email", Pessoa.class)
                .setParameter("email", email).getSingleResult();
    }
}
