package Algorithms;

public class MergeSort2 {
    public static void main(String[] args) {
        int arr[] = {32, 64, 21, 48, 94, 85, 53};
        int start = 0, end = arr.length-1;

        System.out.println("Before sorting: ");
        for(int a : arr){
            System.out.print(a + " ");
        }

        divide(arr, start, end);

        System.out.println("After sorting: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    private static void divide(int[] arr, int start, int end) {
        if(start < end){
            int mid = start + (end - start) / 2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            conquer(arr, start, mid, end);
        }
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int merge[] = new int[end - start + 1];
        int left = start;
        int right = mid+1;
        int x = 0;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                merge[x++] = arr[left++];
            } else {
                merge[x++] = arr[right++];
            }
        }

        while(left <= mid){
            merge[x++] = arr[left++];
        }

        while(right <= end){
            merge[x++] = arr[right++];
        }

        for(int i=start, j=0; i<=end; i++, j++){
            arr[i] = merge[j];
        }
    }
}
