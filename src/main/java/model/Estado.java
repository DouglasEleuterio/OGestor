/**
 * Classe representativa dos Estados da Federação Brasileira.
 * 
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author douglas
 */
@Entity
public class Estado implements Serializable {
    
    @Id
    @GeneratedValue(generator = "estado_gerador", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "estado_gerador", sequenceName = "sequencia_estado", allocationSize = 1)
    private long codigo;

    @Basic(optional = false)
    @Column(nullable = false, unique = true)
    private String nome;
    @Basic(optional = false)
    @Column(nullable = false, unique = true)
    private String uf;

    
    /*
     * Getters and Setters
     */
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
     
}
