package week2;
import java.util.Scanner;
public class Check_Divisiblity
{
    public static void main(String[] args) 
    {
        int n;
        int n2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        System.out.print("Enter any number:");
        n2 = s.nextInt();
        if(n % n2 == 0)
        {
            System.out.println(n+" is divisible by "+ n2);
        }
        else
        {
            System.out.println(n+" is not divisible by "+ n2);
        }
    }
}