//Program to replace a particular character in a string.

import java.util.*;

class replace_str
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        
        char item;
        System.out.println("Enter a Character from the given string : ");
        item = sc.next().charAt(0);
        
        char key;
        System.out.println("Enter the key element : ");
        key = sc.next().charAt(0);
        
        str = str.replace(item,key);
        
        System.out.print("Output : ");
        System.out.println(str);
        
    }
}
