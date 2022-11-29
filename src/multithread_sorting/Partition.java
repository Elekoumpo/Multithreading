package multithread_sorting;

import java.util.Arrays;

public class Partition {

  public int Partition(int ar[], int low, int high) {
        int pivot = ar[high];
        System.out.println(" Pivoit Element is : "+pivot + " For the Array is : "+ Arrays.toString(ar));
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            if (ar[j] < pivot) {
                i++;

                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        int temp = ar[i + 1];
        ar[i + 1] = ar[high];
        ar[high] = temp;

        return i + 1;
    }
}
