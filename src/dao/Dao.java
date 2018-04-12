package dao;

import java.util.Collection;

public interface Dao<T> {
    public boolean create(T obj);
    public T find(Integer id);
    public Collection<T> findAll();
    public boolean update(T obj);
    public boolean delete(T obj);
    public boolean deleteAll();
    public void close();
}
