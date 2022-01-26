//Program to add two numbers.


import java.util.*;

class sum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,sum=0;
        
        System.out.println("Enter First Number : ");
        a = sc.nextInt();
        
        System.out.println("Enter Second Number : ");
        b = sc.nextInt();
        
        sum = a+b;
        
        System.out.println("Sum = "+sum);
    }
}
