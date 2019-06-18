import java.util.*;
import java.io.*;
public class JavaApp
{
    public static void main (String[] args)
    {
        int i,j,s=0;
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();
        while(j!=0)
        {
            int r = j%10;
            s=s*10+r;
            j=j/10;
        
        }
        System.out.println(s);
    }
}
