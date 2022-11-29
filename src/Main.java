import multithread_sorting.QuickSort_Algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int array[]= {5,15,2,1,4,3,8,7,6,10,9,12,13,11,14,17,16,18,19};

        QuickSort_Algo algo = new QuickSort_Algo(array,0,19);
        algo.run();
        System.out.println("Sorted Array :" + Arrays.toString(array));
    }
}