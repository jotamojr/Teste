/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jotamo Jr
 */
@Table(name = "musica")
@Entity
public class Musica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMusica")
    private Integer idMusica;
    @Basic(optional = false)
    @Column(name = "estilo")
    private String estilo;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "generoMusical")
    private String generoMusical;
    @JoinColumn(name = "gravadora_idGravadora", referencedColumnName = "idGravadora")
    @ManyToOne(optional = false)
    private Gravadora gravadoraidGravadora;
    @JoinColumn(name = "musico_idMusico", referencedColumnName = "idMusico")
    @ManyToOne(optional = false)
    private Musico musicoidMusico;

    public Musica() {
    }

    public Musica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public Musica(String estilo, String titulo, String generoMusical, Gravadora gravadoraidGravadora, Musico musicoidMusico) {
        this.estilo = estilo;
        this.titulo = titulo;
        this.generoMusical = generoMusical;
        this.gravadoraidGravadora = gravadoraidGravadora;
        this.musicoidMusico = musicoidMusico;
    }

    public Integer getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Integer idMusica) {
        this.idMusica = idMusica;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public Gravadora getGravadoraidGravadora() {
        return gravadoraidGravadora;
    }

    public void setGravadoraidGravadora(Gravadora gravadoraidGravadora) {
        this.gravadoraidGravadora = gravadoraidGravadora;
    }

    public Musico getMusicoidMusico() {
        return musicoidMusico;
    }

    public void setMusicoidMusico(Musico musicoidMusico) {
        this.musicoidMusico = musicoidMusico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMusica != null ? idMusica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musica)) {
            return false;
        }
        Musica other = (Musica) object;
        if ((this.idMusica == null && other.idMusica != null) || (this.idMusica != null && !this.idMusica.equals(other.idMusica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Musica[ idMusica=" + idMusica + " ]";
    }
    
}
