package dao;

public class DaoFactoryJpa extends DaoFactory{
    
    @Override
    public JpaCompteDao getCompteDao(){
        return JpaCompteDao.getInstance();
    }
    
    @Override
    public JpaDeplacementDao getDeplacementDao(){
        return JpaDeplacementDao.getInstance();
    }
    
}
