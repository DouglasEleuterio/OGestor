/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author douglas
 */
@Entity
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue(generator = "cidade_gerador", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cidade_gerador", sequenceName = "sequencia_cidade", allocationSize = 1)
    private long codigo;

    @Basic(optional = false)
    @Column(nullable = false, unique = true)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "id_estado",nullable = false)
    private Estado estado;

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
