package Session_07;

import java.util.List;

public interface CRUDInterface<T> {
    void save();
    void update();
    int delete();
    List<T> findAll();
}
