package _12_java_collection_framework.exercise.training_arraylist_linkedlist.linkedlist;

public class Product implements Comparable<Product> {
    private int id;
    private String nameProduct;
    private int priceProduct;

    public Product(int id, String nameProduct, int priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}' + "\n";
    }

    @Override
    public int compareTo(Product o) {
        if(this.getId() > o.getId() ){
            return 1;
        }else if(this.getId() < o.getId() ){
            return -1;
        }else {
            return 0;
        }
    }
}
