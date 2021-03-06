package _12_java_collection_framework.exercise.training_arraylist_linkedlist.linkedlist;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPriceProduct() > o2.getPriceProduct()){
            return 1;
        }else if(o1.getPriceProduct() < o2.getPriceProduct()){
            return -1;
        }
        return 0;
    }

}
