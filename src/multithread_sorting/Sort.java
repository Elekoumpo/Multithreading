package multithread_sorting;

public class Sort {
   public void sort(int ar[], int low, int high) {

        if (ar.length <= 4) {
            System.out.println("Array Size is  than 4 Invoking insertion sort ");
            Insertionsort ins = new Insertionsort();
            ins.Insertionsort(ar);
        } else {

            if (low < high) {
                Partition pi = new Partition();
                int pi1 = pi.Partition(ar, low, high);

                sort(ar, low, pi1- 1);
                sort(ar, pi1 + 1, high);
            }
        }

    }
}
