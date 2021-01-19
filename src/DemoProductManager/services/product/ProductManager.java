package DemoProductManager.services.product;

import DemoProductManager.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements ProductService{
    private static List<Product> listProduct;

    static {
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Iphone 10", 600));
        listProduct.add(new Product(2, "Iphone 11", 700));
        listProduct.add(new Product(3, "Iphone 12", 800));
        listProduct.add(new Product(4, "SamSung Note 10", 800));
        listProduct.add(new Product(5, "SamSung Note 11", 1000));
    }



    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void save(Product product) {
        listProduct.add(product);
    }

    @Override
    public void edit(Product product, int id) {
        for (Product product1: listProduct) {
            if (id == product1.getId()){
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
            }
        }
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Product> sortById() {
        return listProduct;
    }
}
