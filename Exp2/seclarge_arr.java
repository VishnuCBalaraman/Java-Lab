//Program to find the second largest element in an array.

import java.util.*;

class seclarge_arr
{
    public static void main(String args[])
    {
        int n,i,l,sl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        
        int a[] = new int [20];
        
        System.out.println("Enter the array elements : ");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        l = a[0];
        sl = a[0];
        
        for(i=0;i<n;i++)
        {
            if(a[i]>l)
                l = a[i];
        }
        
        for(i=0;i<n;i++)
        {
            if(a[i]>sl && a[i]<l)
            {
                sl = a[i];
            }
        }
        System.out.println("Second Largest Element = "+sl);
    }
}
