//Program to check whether a given number is odd or even.


import java.util.*;

class odd_even
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        
        if(n%2 == 0)
            System.out.println("EVEN");
            
        else
            System.out.println("ODD");
    }
}
