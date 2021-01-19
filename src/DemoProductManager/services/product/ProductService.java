package DemoProductManager.services.product;

import DemoProductManager.models.Product;
import DemoProductManager.services.CRUDInterface.CRUDService;
import Session_07.CRUDInterface;

import java.util.List;

public interface ProductService extends CRUDService<Product> {
    List<Product> sortById();
}
