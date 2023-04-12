package TutorOps;

import java.util.Scanner;

public class BubbleSort {
    public void SortArray(int a[]){
        for(int i = 0; i<a.length-1; i++){
            for(int j = 0; j<a.length-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
	}
	public void PrintSortedArray(int a[]){
		for(int i = 0; i<a.length; i++)
            System.out.print(a[i]+" ");
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();
        int a[] = new int[len];
        System.out.println("Enter the array elements:");
        for(int i = 0; i<len; i++){
            a[i] = sc.nextInt();
        }
		BubbleSort ob = new BubbleSort();
		ob.SortArray(a);
        sc.close();
        System.out.println("Sorted array elements are:");
        ob.PrintSortedArray(a);
    }
}
