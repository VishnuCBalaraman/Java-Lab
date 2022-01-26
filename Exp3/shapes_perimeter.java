//Write a Java program to claculate the perimeter of different shapes namely circle and rectangle using the concept of constructor overloading.


import java.util.*;

class shapes_perimeter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r,l,b;
        
        System.out.println("Enter radius : ");
        r = sc.nextInt();
        
        System.out.println("Enter length and breadth : ");
        l = sc.nextInt();
        b = sc.nextInt();
        
        perimeter p = new perimeter(r);
        p = new perimeter(l,b);
    }
}

class perimeter
{
    perimeter(int r)
    {
        float p;
        p = (float)(2*3.14*r);
        System.out.println("Perimeter of Circle = "+p);
    }
    perimeter(int l,int b)
    {
        int p;
        p = 2*(l+b);
        System.out.println("Perimeter of Rectangle = "+p);
    }
}
