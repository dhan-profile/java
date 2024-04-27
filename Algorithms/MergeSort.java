package Algorithms;

class MergeSort{
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 5, 9, 6, 8, 3};
        int start = 0, end = arr.length-1;
        divide(arr, start, end);
        for(int i=0; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void divide(int[] arr, int start, int end) {
        if(start < end){
            int mid = start + (end - start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            conquer(arr, start, mid, end);
        }
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int merge[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= end){
            merge[x++] = arr[idx2++];
        }

        for(int i=start, j=0; i<=end; i++, j++){
            arr[i] = merge[j];
        }
    }
}