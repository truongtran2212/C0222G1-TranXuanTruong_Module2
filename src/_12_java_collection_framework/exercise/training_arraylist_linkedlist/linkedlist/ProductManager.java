package _12_java_collection_framework.exercise.training_arraylist_linkedlist.linkedlist;

import java.util.*;

public class ProductManager {
    public static List<Product> myList = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    public static int size = 0;
    public static void main(String[] args) {


        myList.add(new Product(1, "Coca", 5000));
        myList.add(new Product(2, "Pepsi", 10000));
        myList.add(new Product(3, "Fanta", 20000));
        myList.add(new Product(4, "RedBull", 4000));
        myList.add(new Product(5, "Dr.Thanh", 3000));


        while (true) {

            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xoá sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("7. Thoát option");

            System.out.println("Chọn option");

            int choose = Integer.parseInt(input.nextLine()); // nên chuyển sang dạng này

            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    fixProduct();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    diplay();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    sortByPrice();
                    break;
                case 7:
                    System.exit(7);
                    break;
            }
        }
    }

    public static void diplay() {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        Collections.sort(myList);
    }

    public static void addProduct() {
        System.out.println("Giá");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Tên");
        String nameProduct = input.nextLine();
        System.out.println("id");
        int id = Integer.parseInt(input.nextLine());
        myList.add(new Product(id, nameProduct, price));

        diplay();

    }

    public static void fixProduct() {

        System.out.println("Giá");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Tên");
        String nameProduct = input.nextLine();
        System.out.println("id");
        int id = Integer.parseInt(input.nextLine());

        boolean flag = false;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId() == id) {
                myList.remove(i);
                myList.add(new Product(id, nameProduct, price));
                flag = true;
                diplay();
                break;
            } else {
                flag = false;
            }
        }
        if(!flag){
            System.out.println("Không có id này: ");
        }


    }

    public static void remove() {
        System.out.println("id");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId() == id) {
                myList.remove(i);

            }
        }
        diplay();
    }
    public static void  findProduct(){
        System.out.println("Tên");
        String nameProduct = input.nextLine();
        boolean flag = false;
        for (int i = 0; i <myList.size() ; i++) {
            if(myList.get(i).getNameProduct().equals(nameProduct)){
                System.out.println(myList.get(i));
                flag = true;
            }else{
                flag = false;
            }
        }
        if(!flag){
            System.out.println("Không có sản phẩm này");
        }
    }
    public static void sortByPrice(){
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(myList,priceComparator);
        diplay();
    }
}

