https://www.hackerearth.com/practice/codemonk/
import java.util.*;
class ArrayShift 
{
    public static void main(String args[] ) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tCount = sc.nextInt();
        while(tCount>0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int A[] = new int[N];
            for(int loop=0; loop<N; loop++)
            {
                A[loop] = sc.nextInt();
            }
            K %= N;
            for(int loop=0; loop<N; loop++)
            {
                int result = A[(loop+(N-K))%N];
                System.out.print(result+" ");
            }
            tCount--;
            System.out.println();
        }
    }
}