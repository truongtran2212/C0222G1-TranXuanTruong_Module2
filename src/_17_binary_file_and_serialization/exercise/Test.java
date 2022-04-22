package _17_binary_file_and_serialization.exercise;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();

    public static void diplay() {
        products = InputAndOutputStream.readFile("src\\_17_binary_file_and_serialization\\exercise\\Test.txt");

        for (Product item : products) {
            System.out.println(item);
        }
    }

    public static void addProduct() {
        products = InputAndOutputStream.readFile("src\\_17_binary_file_and_serialization\\exercise\\Test.txt");
        while (true) {

            System.out.println("Nhập id sản phẩm");

            int id = Integer.parseInt(scanner.nextLine());
            boolean flag = true;
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == id) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("Nhập tên sản phẩm");
                String nameProduct = scanner.nextLine();
                System.out.println("Nhập tên sản phẩm");
                String manufacturer = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm");
                int price = Integer.parseInt(scanner.nextLine());

                Product product = new Product(id, nameProduct, manufacturer, price);

                products.add(product);
                System.out.println("Đã thêm thành công");
                try {
                    InputAndOutputStream.writeFile("src\\_17_binary_file_and_serialization\\exercise\\Test.txt", products);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            } else {
                System.out.println("Sản phẩm mới đã bị trùng id với sản phẩm cũ");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {

            System.out.println("-----------Menu------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. tìm kiếm thông tin sản phẩm");
            System.out.println("4. Out khỏi chương trình");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    diplay();
                    break;
                case 3:
                    findInformationProduct();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }

    public static void findInformationProduct() {
        products = InputAndOutputStream.readFile("src\\_17_binary_file_and_serialization\\exercise\\Test.txt");
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().toLowerCase().contains(nameProduct.toLowerCase())) {
                System.out.println(products.get(i).toString());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có sản phẩm này để hiển thị thông tin");
//            System.out.println("--------Nhập lại tên---------");
        }
    }
}
