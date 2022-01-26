import java.util.*;

class factors
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        
        System.out.println("Factors : ");
        for(i=1;i<=n;i++)
        {
            if(n%i == 0)
                System.out.print(i+" ");
        }
    }
}
