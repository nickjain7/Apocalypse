import java.util.*;
public class q4
{
    public static void main (String[] args)
    {
        int i, n,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        for(i=2;i<n;i++)
       {
           if(n%i==0)
           c++;
       }
       if(c==0)
       System.out.println("Prime");
       else 
       System.out.println("Not Prime");
    }
}
