package DemoProductManager.controllers;

import DemoProductManager.models.Product;
import DemoProductManager.services.product.ProductManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static ProductManager productManager = new ProductManager();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-------------Chuong trinh quan ly san pham------------");
        System.out.println("1. Them moi san pham");
        System.out.println("2. Danh sach moi san pham");
        System.out.println("3. Sua san pham");
        System.out.println("Chon chuc nang ban muon thuc hien: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                displayProduct();
                break;
            case 2:
                createProduct();
                break;
            case 3:
                //
                break;
            default:
                System.exit(0);
        }

        //Them moi
//        System.out.println("Nhap id san pham");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap ten san pham");
//        String name = scanner.nextLine();
//        System.out.println("Nhap gia san pham");
//        int price = Integer.parseInt(scanner.nextLine());
//        productManager.save(new Product(id, name, price));
//        List<Product> list = productManager.findAll();
//        for (Product product: list) {
//            System.out.println(product);
//        }

        //Edit
//        System.out.println("Nhap id cua san pham muon edit");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap ten san pham");
//        String name = scanner.nextLine();
//        System.out.println("Nhap gia san pham");
//        int price = Integer.parseInt(scanner.nextLine());
//        productManager.edit(new Product(id,name, price), id);
//
//        List<Product> list = productManager.findAll();
//        for (Product product : list) {
//            System.out.println(product);
//        }
    }

    private static void createProduct() {
        System.out.println("Nhap id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        int price = Integer.parseInt(scanner.nextLine());
        productManager.save(new Product(id, name, price));
    }

    private static void displayProduct() {
        List<Product> list = productManager.findAll();
        for (Product product: list) {
            System.out.println(product);
        }
    }
}
