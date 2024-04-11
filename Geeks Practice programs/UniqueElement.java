//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class UniqueElement
{
    public static void main(String args[])
    {
		int[] array = {4, 1, 4, 6, 3, 2, 9, 7, 3, 6, 2, 8, 1, 7, 9};
		int res = findSingle(array);
		System.out.println("The given elemens are: " + Arrays.toString(array));
		System.out.println("The unique element is: " + res);
    }
	
    static int findSingle(int arr[]){
        // code here
        int xor=0;
        for(int i=0;i<arr.length;i++){
           xor^=arr[i];
        }
        return xor;
        // when duplicate elements are XOR-ed, they will cancel each other leaving the unique element
    }
}