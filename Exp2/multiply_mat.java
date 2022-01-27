//Program to multiply two matrices.

import java.util.*;

class multiply_mat
{
    public static void main(String args[])
    {
        int r1,c1,r2,c2,i,j,k,sum=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter row & col size of first mat : ");
        r1 = sc.nextInt(); 
        c1 = sc.nextInt();
        int a[][] = new int[20][20];
        System.out.println("Enter the elements of first mat : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter row & col size of second mat : ");
        r2 = sc.nextInt(); 
        c2 = sc.nextInt();
        int b[][] = new int[20][20];
        System.out.println("Enter the elements of second mat : ");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        
        int p[][] = new int[20][20];
        
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                for(k=0;k<r2;k++)
                {
                    sum = sum + a[i][k]*b[k][j];
                }
                p[i][j] = sum;
                sum=0;
            }
        }
        
        System.out.println("Output : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}
