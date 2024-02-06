import java.util.Scanner;
public class reverse 
{
    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original=s1.nextLine();
        String rev="";
        System.out.println("Original string: "+original);
        for(int i=0; i<original.length(); i++)
        {
            rev= original.charAt(i)+rev;
        }
        System.out.println("Reversed string: "+rev);
    }
}
