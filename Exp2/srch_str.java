import java.util.*;

class srch_str
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        
        char key;
        System.out.println("Enter a character to be searched : ");
        key = sc.next().charAt(0);
        
        int len = str.length();
        int flag=0,i;
        
        for(i=0;i<len;i++)
        {
            if(str.charAt(i) == key)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==0)
            System.out.println("Element Not Found");
        
        else
            System.out.println("Element "+key+" Found at position "+(i+1));
        
        
    }
}
