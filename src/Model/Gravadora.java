/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jotamo Jr
 */
@Table(name = "gravadora")
@Entity
public class Gravadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGravadora")
    private Integer idGravadora;
    @Column(name = "nome")
    private String nome;
    @Column(name = "numeroMusicas")
    private int numeroMusicas;
    @Column(name = "estado")
    private short estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gravadoraidGravadora")
    private Collection<Musica> musicaCollection;
    
    public Gravadora() {
    }

    public Gravadora(Integer idGravadora) {
        this.idGravadora = idGravadora;
    }

    public Gravadora(String nome, int numeroMusicas) {
        this.nome = nome;
        this.numeroMusicas = numeroMusicas;
    }

    public Integer getIdGravadora() {
        return idGravadora;
    }

    public void setIdGravadora(Integer idGravadora) {
        this.idGravadora = idGravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Musica> getMusicaCollection() {
        return musicaCollection;
    }

    public void setMusicaCollection(Collection<Musica> musicaCollection) {
        this.musicaCollection = musicaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGravadora != null ? idGravadora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gravadora)) {
            return false;
        }
        Gravadora other = (Gravadora) object;
        if ((this.idGravadora == null && other.idGravadora != null) || (this.idGravadora != null && !this.idGravadora.equals(other.idGravadora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Gravadora[ idGravadora=" + idGravadora + " ]";
    }
    
}
