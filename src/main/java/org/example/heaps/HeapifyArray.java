package org.example.heaps;

public class HeapifyArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 2, 8, 15};

        buildMaxHeap(arr);

        for (int num : arr) {
            System.out.println(num + " ");
        }

        buildMinHeap(arr);

        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void heapify(int[] arr,int n, int i){
        int largest = i;

        int left = 2*i+1;
        int right =2*i+2;


        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }

        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest != i){
            int temp = arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;

            heapify(arr,n,largest);
        }


    }

    public static void buildMaxHeap(int[] arr){
        int n = arr.length;
        for(int i = n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    public static void buildMinHeap(int[] arr){
       int n= arr.length;

        for (int i = n/2-1;i>=0;i--){
            minHeapify(arr,n,i);
        }
    }

    public static void minHeapify(int[] arr,int n,int i){
        int left=2*i+1;
        int right=2*i+2;

        int smallest=i;
        if(left<n && arr[left]<arr[smallest]){
            smallest=left;
        }

        if(right<n && arr[right]<arr[smallest]){
            smallest=right;
        }

        if(smallest != i){
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            minHeapify(arr,n,smallest);
        }
    }
}
