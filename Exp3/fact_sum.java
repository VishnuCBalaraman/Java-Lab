//Program with functions included within the main() class to find factorial and sum of digits of the number.

import java.util.*;

class fact_sum
{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        fact_sum obj = new fact_sum();
        
        int n;
        System.out.println("Enter the Number : ");
        n = sc.nextInt();
        
        obj.factorial(n);
        obj.sum(n);
    }
    
    void factorial(int n)
    {
        int i,f=1;
        
        for(i=1;i<=n;i++)
        {
            f = f*i;
        }
        System.out.println("Factorial = "+f);
    }
    
    void sum(int n)
    {
        int rem,sum=0;
        
        while(n != 0)
        {
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Sum of digits = "+sum);
    }
}
