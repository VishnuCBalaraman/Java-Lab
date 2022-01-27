//Program to find whether a string is palindrome or not.

import java.util.*;

class palindrome_str
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        
        String org_str = str;
        int len = str.length();
        
        String rev = "";
        
        for(int i=len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        
        if(org_str.equals(rev))
            System.out.println("Plaindrome");
        
        else
            System.out.println("Not Palindrome");
    }
}
