//Program to create a student class with name,roll no and marks of five subjects. Write functions to read and display the details.

import java.util.*;

class student
{
    public static void main(String args[])
    {
        student std = new student();
        std.read();
    }
    
    void read()
    {
        student std = new student();
        Scanner sc = new Scanner(System.in);
        int rollno;
        String name;
        int marks[] = new int[5];
        
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        
        System.out.println("Enter Roll No. : ");
        rollno = sc.nextInt();
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Marks of Subject "+(i+1)+" : ");
            marks[i] = sc.nextInt();
        }
        std.display(rollno,name,marks);
    }
    
    void display(int rollno,String name,int marks[])
    {
        System.out.println();
        System.out.println("Details : ");
        System.out.println("Roll No. : "+rollno);
        System.out.println("Name : "+name);
        for(int i=0;i<5;i++)
        {
            System.out.println("Marks of Subject "+(i+1)+" : "+marks[i]);
        }
    }
}
