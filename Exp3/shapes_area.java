//Write a Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading.


import java.util.*;
import java.lang.Math;

class shapes_area
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int r,x,y,l,m,n;
        
        System.out.println("Enter radius : ");
        r = sc.nextInt();
        System.out.println("Enter length and breadth : ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Enter side lengths : ");
        l = sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();
        
        shapes obj = new shapes();
        
        obj.area(r);
        obj.area(x,y);
        obj.area(l,m,n);
    }
}

class shapes
{
    void area(int r)
    {
        float a;
        a = (float)3.14*r*r;
        System.out.println("Area of Circle = "+a);
    }
    void area(int x,int y)
    {
        int a;
        a = x*y;
        System.out.println("Area of Rectangle = "+a);
    }
    void area(int l,int m,int n)
    {
        float a,s;
        s = (l+m+n)/3;
        a = s*(s-l)*(s-m)*(s-n);
        System.out.println("Area of Triangle = "+Math.sqrt(a));
    }
}
