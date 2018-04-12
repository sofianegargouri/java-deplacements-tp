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
@Table(name = "COMPTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comptes.findAll", query = "SELECT c FROM Compte c")
    , @NamedQuery(name = "Comptes.findByEmail", query = "SELECT c FROM Compte c WHERE c.email = :email")
    , @NamedQuery(name = "Comptes.findByMdp", query = "SELECT c FROM Compte c WHERE c.mdp = :mdp")})
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MDP")
    private String mdp;

    public Compte() {
    }

    public Compte(String email) {
        this.email = email;
    }

    public Compte(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Comptes[ email=" + email + " ]";
    }
    
}
