package model;

import model.ENUMs.LogradouroTipo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(generator = "endereco_gerador", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "endereco_gerador", sequenceName = "sequencia_endereco", allocationSize = 1)
    private long codigo;

    @Enumerated(EnumType.STRING)
    private LogradouroTipo logradouroTipo;

    private String logradouro;
    private String numero;
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "id_cidade", nullable = false)
    private Cidade cidade;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LogradouroTipo getLogradouroTipo() {
        return logradouroTipo;
    }

    public void setLogradouroTipo(LogradouroTipo logradouroTipo) {
        this.logradouroTipo = logradouroTipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
