package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class JpaDao<T> {
    public static EntityManagerFactory emFactory;
    public static EntityManager entityManager;
    
    public JpaDao(){
        emFactory = Persistence.createEntityManagerFactory("DeplacementPU");
        entityManager = emFactory.createEntityManager();
    }
    
    public boolean create(T obj){
        final EntityTransaction et = entityManager.getTransaction();
        try{
            et.begin();
            entityManager.persist(obj);
            et.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean update(T obj){
        final EntityTransaction et = entityManager.getTransaction();
        try{
            et.begin();
            entityManager.merge(obj);
            et.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
        
    }
    
    public boolean delete(T obj){
        final EntityTransaction et = entityManager.getTransaction();
        try{
            et.begin();
            entityManager.remove(obj);
            et.commit();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
        
    }
    
    public  void close(){
        entityManager.close();
        emFactory.close();
    }
}
