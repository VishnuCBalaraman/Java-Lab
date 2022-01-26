//Program to print fibonacci series upto n.


import java.util.*;

class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,t1=0,t2=1,next;
        
        System.out.println("Enter a limit : ");
        n = sc.nextInt();
        
        System.out.println("Fibinocci Series : ");
        for(i=1;i<=n;i++)
        {
            System.out.print(t1+" ");
            next = t1+t2;
            t1 = t2;
            t2 = next;
        }
    }
}
