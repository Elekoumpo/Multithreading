package multithread_sorting;

import java.util.Arrays;

public class Insertionsort {

    public void Insertionsort(int ar[]) {
        System.out.println("InsertionSort for  " + Arrays.toString(ar));
        int n = ar.length;
        for (int i = 1; i < n; ++i) {
            int key = ar[i];
            int j = i - 1;

            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j = j - 1;
            }
            ar[j + 1] = key;
        }
        System.out.println("Sorted Array :" + Arrays.toString(ar));
    }
}
