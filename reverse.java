public class reverse 
{
    public static void main(String[] args)
    {
        String original="ance";
        String reversed="";
        System.out.println("Original string: "+original);
        for(int i=0; i<original.length(); i++)
        {
            reversed= original.charAt(i)+reversed;
        }
        System.out.println("Reversed string: "+reversed);
    }
}
