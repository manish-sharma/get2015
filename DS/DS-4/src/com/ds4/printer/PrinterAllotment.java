package com.ds4.printer;
/*This class does the sorting of the job for printer according the priority using heapsort
 * @author Shishir Pareek
 * Date 31st August 2015
 */
public class PrinterAllotment {
 
    private static int N;

    /* Sort Function */

    public static void heapSort(Node arr[])

    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
           maxheap(arr, 0);
        }
    }     

    /* Function to build a heap */   
    public static void heapify(Node arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }

    /* Function to swap highest priority element in heap */        
    public static void maxheap(Node arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left].priority > arr[i].priority)
            max = left;
        if (right <= N && arr[right].priority > arr[max].priority)        
            max = right;
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    

    /* Function to swap two jobs in an array */
    public static void swap(Node arr[], int i, int j)
    {
        Node tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    
	
}
