
package DAO;

import Util.DBException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import model.Cidade;
import model.Endereco;
import model.Estado;

public class EnderecoDAO extends SuperDAO{
    public void salvar(Endereco endereco) throws SQLException, DBException {
        EntityManager em = super.getConetion();
        em.getTransaction().begin();
        em.persist(endereco);
        em.getTransaction().commit();
        em.close();
    }

    public List<Endereco> consultarTodos() {
        return em.createQuery("from Endereco").getResultList();
    }

    public void deletar(Endereco endereco) {
        em.getTransaction().begin();
        em.remove(endereco);
        em.getTransaction().commit();
        em.close();
    }

    public void alterar(Endereco endereco) {
        em.getTransaction().begin();
        em.merge(endereco);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Endereco> buscaEnderecosPorCidade(String cidade) {
        return em.createQuery("SELECT e from Endereco as e WHERE e.cidade = :cidade")
                .setParameter("cidade", cidade).getResultList();
    }
    
     public List<Cidade> consultarCidadesPorEstado(Estado estado) {
        return em.createQuery("SELECT c from Cidade as c WHERE c.estado = :estado")
                .setParameter("estado", estado).getResultList();
    }
}
