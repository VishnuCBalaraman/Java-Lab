//Program to replace a particular element in an array.

import java.util.*;

class replace_arr 
{
    public static void main(String args[])
    {
        int n,i,j,num,key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        n = sc.nextInt();
        
        int a[] = new int[20];
        
        System.out.println("Enter the array elements : ");
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Select the element : ");
        num = sc.nextInt();
        System.out.println("Enter the key element : ");
        key = sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            if(a[i] == num)
            {
                a[i] = key;
            }
        }
        
        System.out.println("Output : ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
