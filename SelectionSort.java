package TutorOps;

import java.util.Scanner;

public class SelectionSort {
    public void SortArray(int a[]) {
        int loc;
        for (int i = 0; i < a.length - 1; i++) {
            loc = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[loc] > a[j]) {
                    loc = j;
                }
            }
            int temp = a[loc];
            a[loc] = a[i];
            a[i] = temp;
        }
    }

    public void PrintSortedArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();
        int a[] = new int[len];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        SelectionSort ob = new SelectionSort();
        ob.SortArray(a);
        sc.close();
        System.out.println("Sorted array elements are:");
        ob.PrintSortedArray(a);
    }
}