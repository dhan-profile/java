package Package2;

public class ArrayEg {

	static int a;
	final int b = 0;
	transient int c = 0;
	volatile int d = 0;
		
	public static void main(String[] args) {
	        int a[]= new int[5];
	        a[0]= 10;
	        a[1] = 15;
	        a[2]=40;
	        a[3]=80;
	        a[4]=70;
//	        
//	        for(int i=0;i<a.length;i++)
//	        System.out.println(a[i]);
	        
	        
//	        for(int i=a.length-1;i>=0;i--)
//	          System.out.println(a[i]);
	        
	    //for(type ref_name:array)
//	    for(int s:a)    
//	        System.out.println(s);

	/*
	            int ab[] ={40,80,20,140,50};
	           
	           Scanner sc = new Scanner(System.in); 
	           Scanner sc1 = new Scanner(System.in);
	           int size = sc.nextInt();//5
	           //sc.nextLine();
	           String str[] = new String[size];
	           
	           for(int i=0;i<str.length;i++){
	            System.out.print("enter the item: ");
	           str[i] = sc1.nextLine();

	           }
	            
	     */


	         int arr[] = {40,5,120,78,150,65,47};

	            int sum = 0;
	            
	                for(int i=0;i<arr.length;i++){
	                    sum += arr[i];
	                    //sum = sum + arr[i];//165
	                }
	                System.out.println("Sum is: " + sum);

	                int[] arrCopy = new int[arr.length];
	                // Copy Array ===============================
	                System.arraycopy(arr, 2, arrCopy, 0, 5);
	                for (int i = 0; i < arrCopy.length; i++) {
						System.out.print(arrCopy[i] + " ");
					}
	                System.out.println();
	                // Clone Array ===================================
	                int[] arrClone = arrCopy.clone();
	                for(int i : arrClone) {
	                	System.out.print(i + " ");
	                }
	    }
	    
	}