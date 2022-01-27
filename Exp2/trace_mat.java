//Program to find trace of matrix.

import java.util.*;

class trace_mat
{
    public static void main(String args[])
    {
        int n,i,j,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix : ");
        n = sc.nextInt();
        
        int a[][] = new int[20][20];
        
        System.out.println("Enter the elements of matrix : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum = sum + a[i][j];
                }
            }
        }
        
        System.out.println("Trace : "+sum);
    }
}
