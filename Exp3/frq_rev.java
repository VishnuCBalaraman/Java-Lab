//Create a class with functions to find the frequency of a given character in a string and to reverse a given string. The functions should be invoked form the main().


import java.util.*;

class frq_rev
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        frq_rev obj = new frq_rev();
        
        String str;
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        
        char key;
        System.out.println("Enter a character from the given string : ");
        key = sc.next().charAt(0);
        
        obj.frq(str,key);
        obj.reverse(str);
    }
    
    void frq(String str,char key)
    {
        int len = str.length();
        int i,count=0;
        for(i=0;i<len;i++)
        {
            if(str.charAt(i) == key)
                count++;
        }
        System.out.println("Frequency count of character "+key+" = "+count);
    }
    
    void reverse(String str)
    {
        int len = str.length();
        int i;
        
        String rev="";
        for(i=len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String : "+rev);
    }
}
