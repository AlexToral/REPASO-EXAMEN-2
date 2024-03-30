package utils;

import java.util.Arrays;


public class utils {

//MergeSort sin mejorar
    public static void MergeSort(int[] array){
        if(array.length == 1){
            return;
        }

        int medio = array.length/2;

        int[] l = new int[medio];
        int[] r = new int[array.length - medio];
        int countR = 0;

        for (int i = 0; i < array.length; i++)
        {
            if(i < medio)
            {
                l[i] = array[i];
            }
            else{
                r[countR] = array[i];
                countR++;
            }
        }
        MergeSort(l);
        MergeSort(r);

        Merge(array,l,r);

    }

    private static void Merge(int[] array, int[] left, int[] right){
        int leftLim = left.length;
        int rightLim = right.length;
        int leftindx = 0;
        int rightindx = 0;
        int arrayindx = 0;
        while(leftindx < leftLim && rightindx < rightLim){
            if(left[leftindx] < right[rightindx]){
                array[arrayindx] = left[leftindx];
                leftindx++;
            }else{
                array[arrayindx] = right[rightindx];
                rightindx++;
            }
            arrayindx++;
        }

        while (leftindx < leftLim) {

            array[arrayindx] = left[leftindx];
            arrayindx++;
            leftindx++;
        }

        while (rightindx < rightLim) {

            array[arrayindx] = right[rightindx];
            arrayindx++;
            rightindx++;
        }

    }
    public static void QuickSort(int[] array){
        QuickSort(array,0,array.length-1);
    }
    private static void QuickSort(int[] array, int start, int end){

        if(end <= start) return;

        int pivot = partition(array,start,end);
        QuickSort(array,start,pivot-1);
        QuickSort(array,pivot + 1,end);

    }

    private static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            System.out.println("j: " + j + " p: " + pivot);
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;


        return i;
    }

}
