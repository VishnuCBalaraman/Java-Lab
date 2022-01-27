//Program to find transpose of a matrix.

import java.util.*;

class transpose_mat
{
    public static void main(String args[])
    {
        int r,c,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        r = sc.nextInt();
        System.out.println("Enter the column size : ");
        c = sc.nextInt();
        
        int a[][] = new int[20][20];
        
        System.out.println("Enter the elements of matrix : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        int b[][] = new int[20][20];
        
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                b[i][j] = a[j][i];
            }
        }
        
        System.out.println("Transpose : ");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
