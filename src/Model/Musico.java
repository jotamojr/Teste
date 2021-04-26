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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jotamo Jr
 */
@Table(name = "musico")
@Entity
public class Musico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMusico")
    private Integer idMusico;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "apelido")
    private String apelido;
    @Basic(optional = false)
    @Column(name = "estiloMusical")
    private String estiloMusical;
    @Basic(optional = false)
    @Column(name = "numeroMusicas")
    private int numeroMusicas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "musicoidMusico")
    private Collection<Musica> musicaCollection;

    public Musico() {
    }

    public Musico(Integer idMusico) {
        this.idMusico = idMusico;
    }

    public Musico(String nome, String apelido, String estiloMusical, int numeroMusicas) {
        this.nome = nome;
        this.apelido = apelido;
        this.estiloMusical = estiloMusical;
        this.numeroMusicas = numeroMusicas;
    }

    public Integer getIdMusico() {
        return idMusico;
    }

    public void setIdMusico(Integer idMusico) {
        this.idMusico = idMusico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public int getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
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
        hash += (idMusico != null ? idMusico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musico)) {
            return false;
        }
        Musico other = (Musico) object;
        if ((this.idMusico == null && other.idMusico != null) || (this.idMusico != null && !this.idMusico.equals(other.idMusico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Musico[ idMusico=" + idMusico + " ]";
    }
    
}
