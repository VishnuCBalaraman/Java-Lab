import java.util.*;

class add_mat
{
    public static void main(String args[])
    {
        int n,m,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first matrix : ");
        n = sc.nextInt();
        System.out.println("Enter the size of second matrix : ");
        m = sc.nextInt();
        
        int a[][] = new int [20][20];
        int b[][] = new int [20][20];
        
        System.out.println("Enter the elements of first matrix : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of second matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        
        
        int c[][] = new int[20][20];
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        System.out.println("Output : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
