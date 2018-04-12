package dao;

import java.util.Collection;
import models.Deplacement;

public interface DeplacementDao extends Dao<Deplacement>{
    
    public Collection<Deplacement> findAll();
}
