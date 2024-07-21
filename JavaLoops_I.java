import java.util.Scanner;
public class JavaLoops_I {
    public static void main(String [] args)
    {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
            for(int i = 1 ; i <= 10 ; i++)
            {
                int k = N * i;
                System.out.println(N +" x "+ i +" = "+ k);
            }
            
    }
}
