package _14_sort_algorithm.exercise;

import java.util.Arrays;

public class SettingInsertionSort {
    public static void insertionSort(int []array){

        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;

        }

        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int [] array = {33,44,21,12,5,1,89,6};

        insertionSort(array);
    }
}
