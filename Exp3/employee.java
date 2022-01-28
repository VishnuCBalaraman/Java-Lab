
//Java program to create a class employee with details such as empno,name and phone number. Read details of atleast 5 employees and print.


import java.util.*;

class employee
{
    String name;
    int empno;
    String empph;
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        employee e[] = new employee[10];
        
        int n;
        System.out.println("Enter the no. of employees : ");
        n = sc.nextInt();
        System.out.println();
        
        for(int i=0;i<n;i++)
        {
            e[i] = new employee();
            System.out.println("Enter the name of employee "+(i+1)+" : ");
            e[i].name = sc.next();
            System.out.println("Enter the empno of employee "+(i+1)+" : ");
            e[i].empno = sc.nextInt();
            System.out.println("Enter the phone no of employee "+(i+1)+" : ");
            e[i].empph = sc.next();
            System.out.println();
        }
        
        System.out.println("Details : ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Empno of employee "+(i+1)+" : "+e[i].empno);
            System.out.println("Name of employee "+(i+1)+" : "+e[i].name);
            System.out.println("Phone no of employee "+(i+1)+" : "+e[i].empph);
            System.out.println();
        }
    }
}
