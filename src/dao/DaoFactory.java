package dao;

public abstract class DaoFactory {
    
    public abstract JpaCompteDao getCompteDao();
    
    public abstract JpaDeplacementDao getDeplacementDao();
    
}
