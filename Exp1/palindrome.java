//Program to check whether given number is palindrome or not.


import java.util.*;

class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,num,rem,sum=0;
        
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        num = n;
        
        while(n!=0)
        {
            rem = n%10;
            sum = sum*10 + rem;
            n = n/10;
        }
        
        if(sum == num)
            System.out.println("Palindrome");
        
        else
            System.out.println("Not Plaindrome");
    }
}
