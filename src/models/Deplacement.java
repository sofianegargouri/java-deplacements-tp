/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sofianegargouri
 */
@Entity
@Table(name = "DEPLACEMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deplacements.findAll", query = "SELECT d FROM Deplacement d")
    , @NamedQuery(name = "Deplacements.findById", query = "SELECT d FROM Deplacement d WHERE d.id = :id")
    , @NamedQuery(name = "Deplacements.findByDate", query = "SELECT d FROM Deplacement d WHERE d.date = :date")
    , @NamedQuery(name = "Deplacements.findByJourtravaille", query = "SELECT d FROM Deplacement d WHERE d.jourtravaille = :jourtravaille")
    , @NamedQuery(name = "Deplacements.findByModedeplacement", query = "SELECT d FROM Deplacement d WHERE d.modedeplacement = :modedeplacement")
    , @NamedQuery(name = "Deplacements.findByDistanceparcourue", query = "SELECT d FROM Deplacement d WHERE d.distanceparcourue = :distanceparcourue")
    , @NamedQuery(name = "Deplacements.findByUserid", query = "SELECT d FROM Deplacement d WHERE d.userid = :userid")})
public class Deplacement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATE")
    private Integer date;
    @Column(name = "JOURTRAVAILLE")
    private Boolean jourtravaille;
    @Column(name = "MODEDEPLACEMENT")
    private String modedeplacement;
    @Column(name = "DISTANCEPARCOURUE")
    private Integer distanceparcourue;
    @Column(name = "USERID")
    private String userid;

    public Deplacement() {
    }

    public Deplacement(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Boolean getJourtravaille() {
        return jourtravaille;
    }

    public void setJourtravaille(Boolean jourtravaille) {
        this.jourtravaille = jourtravaille;
    }

    public String getModedeplacement() {
        return modedeplacement;
    }

    public void setModedeplacement(String modedeplacement) {
        this.modedeplacement = modedeplacement;
    }

    public Integer getDistanceparcourue() {
        return distanceparcourue;
    }

    public void setDistanceparcourue(Integer distanceparcourue) {
        this.distanceparcourue = distanceparcourue;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deplacement)) {
            return false;
        }
        Deplacement other = (Deplacement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Deplacements[ id=" + id + " ]";
    }
    
}
