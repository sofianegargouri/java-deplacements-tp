package dao;

import java.util.Collection;
import models.Compte;

public interface CompteDao extends Dao<Compte>{
    
    public Collection<Compte> findAll();
}
