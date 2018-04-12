package dao;

import static dao.JpaDao.entityManager;
import java.util.Collection;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import models.Deplacement;

public class JpaDeplacementDao extends JpaDao<Deplacement> implements DeplacementDao{
    
    private static JpaDeplacementDao instance;
    
    private JpaDeplacementDao(){
        super();
    }
    
    static JpaDeplacementDao getInstance(){
        if(instance == null){
            instance = new JpaDeplacementDao();
        }
        return instance;
    }

    @Override
    public boolean create(Deplacement obj) {
        return super.create(obj);
    }

    @Override
    public Deplacement find(Integer id) {
        return entityManager.find(Deplacement.class, id);
    }

    @Override
    public Collection<Deplacement> findAll() {
        Query query = entityManager.createQuery("SELECT d FROM Deplacement d");
        return query.getResultList();
    }

    @Override
    public boolean update(Deplacement obj) {
        return super.update(obj);
    }

    @Override
    public boolean delete(Deplacement obj) {
        return super.delete(obj);
    }

    @Override
    public boolean deleteAll() {
        try{
            Query query = entityManager.createNativeQuery("DELETE FROM deplacements");
            EntityTransaction etx = entityManager.getTransaction();
            etx.begin();
            query.executeUpdate();
            etx.commit();
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
