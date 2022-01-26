import java.util.*;

class freqcount_str
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        
        int len = str.length();
        int i,count=0;
        
        char key;
        System.out.println("Enter a character that to be counted : ");
        key = sc.next().charAt(0);
        
        for(i=0;i<len;i++)
        {
            if(str.charAt(i) == key)
                count++;
        }
        
        System.out.println("The Frequency count of "+key+" is = "+count);
        
    }
}
