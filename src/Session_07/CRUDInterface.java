package Session_07;

import java.util.List;

public interface CRUDInterface{
    void save();
    void update();
    int delete();
    List findAll();
}
