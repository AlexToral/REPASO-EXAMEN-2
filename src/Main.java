import utils.utils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,5,2,3,4,6,9,10,23,7,-1};
        utils.QuickSort(array);
        System.out.println(Arrays.toString(array));

    }
}