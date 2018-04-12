package dao;

import static dao.JpaDao.entityManager;
import java.util.Collection;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import models.Compte;

public class JpaCompteDao extends JpaDao<Compte> implements CompteDao{
    
    private static JpaCompteDao instance;
    
    private JpaCompteDao(){
        super();
    }
    
    static JpaCompteDao getInstance(){
        if(instance == null){
            instance = new JpaCompteDao();
        }
        return instance;
    }

    @Override
    public boolean create(Compte obj) {
        return super.create(obj);
    }

    @Override
    public Compte find(Integer id) {
        return entityManager.find(Compte.class, id);
    }

    @Override
    public Collection<Compte> findAll() {
        Query query = entityManager.createQuery("SELECT * FROM Compte c");
        return query.getResultList();
    }

    @Override
    public boolean update(Compte obj) {
        return super.update(obj);
    }

    @Override
    public boolean delete(Compte obj) {
        return super.delete(obj);
    }

    @Override
    public boolean deleteAll() {
        try{
            Query query = entityManager.createNativeQuery("DELETE FROM Comptes");
            EntityTransaction etx = entityManager.getTransaction();
            etx.begin();
            query.executeUpdate();
            etx.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
