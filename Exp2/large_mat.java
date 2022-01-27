//Program to find the largest element in a NXN matrix.

import java.util.*;

class large_mat
{
    public static void main(String args[])
    {
        int r,c,i,j,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        r = sc.nextInt();
        System.out.println("Enter the column size : ");
        c = sc.nextInt();
        
        int a[][] = new int [20][20];
        
        System.out.println("Enter the elements of matrix : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        l = a[0][0];
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i][j] > l)
                    l = a[i][j];
            }
        }
        
        System.out.println("Largest Element = "+l);
    }
}
