package DemoProductManager.services.CRUDInterface;

import java.util.List;

public interface CRUDService<T> {
    List<T> findAll();
    T findById(int id);
    void save(T t);
    void edit(T t, int id);
    void remove(int id);
}
