package TutorOps;

public class InsertionSort {
    public void sort(int array[]) {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);
        for (int i = size - 1; i >= 0; i--) {
            int x = array[0];
            array[0] = array[i];
            array[i] = x;
            heapify(array, i, 0);
        }
    }

    void heapify(int array[], int SizeofHeap, int i) {
        int largestelement = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < SizeofHeap && array[leftChild] > array[largestelement])
            largestelement = leftChild;
        if (rightChild < SizeofHeap && array[rightChild] > array[largestelement])
            largestelement = rightChild;
        if (largestelement != i) {
            int temp = array[i];
            array[i] = array[largestelement];
            array[largestelement] = temp;
            heapify(array, SizeofHeap, largestelement);
        }
    }

    public static void main(String args[]) {
        int array[] = { 8, 5, 2, 9, 5, 6, 3 };
        InsertionSort obj = new InsertionSort();
        obj.sort(array);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}