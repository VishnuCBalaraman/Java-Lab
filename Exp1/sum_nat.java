//Program to find sum of first n natural numbers.


import java.util.*;

class sum_nat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
        
        System.out.println("Enter a limit : ");
        n = sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        
        System.out.println("Sum = "+sum);
    }
}
