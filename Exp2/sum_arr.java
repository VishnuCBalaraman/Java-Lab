//Program to find the sum of elements in an array.

import java.util.*;

class sum_arr
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        
        int a[] = new int [20];
        
        System.out.println("Enter the array elements : ");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            sum = sum + a[i];
        }
        
        System.out.println("Sum = "+sum);
    }
}
