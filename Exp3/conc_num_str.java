//Java program to concatenate two numbers and strings using method overloading concept.


import java.util.*;

class conc_num_str
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        String str1,str2;
        
        System.out.println("Enter two Strings : ");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        
        System.out.println("Enter two Numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        concatenate c = new concatenate();
        
        c.concat(num1,num2);
        c.concat(str1,str2);
    }
}

class concatenate
{
    void concat(int num1,int num2)
    {
        System.out.println("Concatenated Number : "+num1+num2);
    }
    
    void concat(String str1,String str2)
    {
        String str3;
        str3 = str1.concat(str2);
        System.out.println("Concatenated String : "+str3);
    }
}
