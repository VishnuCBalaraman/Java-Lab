//Program to check whether a given number is prime or not.


import java.util.*;

class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,count=0;
        
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        
        if(count==2)
            System.out.println("Prime");
        
        else
            System.out.println("Not Prime");
        
    }
}
