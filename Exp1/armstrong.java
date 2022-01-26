import java.util.*;

class armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,num,i,rem,sum=0,c=0,p;
        
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        num = n;
        
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        
        n=num;
        
        while(n!=0)
        {
            p=1;
            rem = n%10;
            for(i=1;i<=c;i++)
            {
                p = p*rem;
            }
            sum = sum+p;
            n=n/10;
        }
        
        if(sum == num)
            System.out.println("Armstrong");
            
        else
            System.out.println("Not Armstrong");
    }
}
