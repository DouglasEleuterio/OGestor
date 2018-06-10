package model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@Entity
//Campos que sao Unicos na tabela de dados. - uniqueConstraints - 
@Table(uniqueConstraints = {
    @UniqueConstraint(
            columnNames = {"codigo","cpf","nomeUsuario","email"}
    )})

public class Pessoa {

    @Id
    @GeneratedValue(generator = "pessoa_gerador", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pessoa_gerador", sequenceName = "sequencia_pessoa", allocationSize = 1)
    private long codigo;
    
    @Basic(optional = false)
    private String nome;

    @Column(nullable = false, name = "ATIVO")
    private boolean ativo = true;

    @Basic(optional = false)
    @Column(nullable = false, unique = true)
    @CPF(message = "O CPF é Obrigatorio")
    private String cpf;
    
    @Basic(optional = false)
    @Temporal(value = TemporalType.DATE)
    private Date dataNascimento;
    
    @Basic(optional = false)
    @Column(name = "nomeusuario")
    private String nomeUsuario;
    
    @Column(nullable = false)
    private String senha;

    @Basic(optional = true)
    @Email
    private String email;
    
    /*
     * Getters and Setters
     */
        
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
