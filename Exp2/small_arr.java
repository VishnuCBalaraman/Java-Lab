
import java.util.*;

class small_arr
{
    public static void main(String args[])
    {
        int n,i,small;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        
        int a[] = new int [20];
        
        System.out.println("Enter the array elements : ");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        small = a[0];
        
        for(i=1;i<n;i++)
        {
            if(a[i]<small)
                small = a[i];
        }
        
        System.out.println("Smallest Element = "+small);
    }
}
