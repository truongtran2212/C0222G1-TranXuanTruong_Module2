package _07_abstract_class_and_interface.practice.test4;

import java.util.Arrays;

public class Interface {
    public static void main(String[] args) {
        int [] array = {23,5,1,8,9,6,7,10,12};
        int min;
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
