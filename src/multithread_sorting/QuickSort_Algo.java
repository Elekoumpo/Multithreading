package multithread_sorting;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class QuickSort_Algo implements Runnable {
    private int ar[];
    private int low;
    private int high;

    public QuickSort_Algo(int ar[], int low, int high) {
        this.ar = ar;
        this.low = low;
        this.high = high;
    }
    @Override
    public void run() {
        try {
            sort(ar, low, high);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}