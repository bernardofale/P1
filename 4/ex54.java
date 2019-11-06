import java.util.*;
public class ex54{
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Insira um número para calcular o factorial: ");
        int x=Integer.parseInt(sc.nextLine());

        fact(x);

    }
    public static void fact(int n){
        int fac = 1;

        for(int i = 1; i <= n; i++)
        {
            fac *= i;
            System.out.printf("%d! = %d \n",i,fac);
 
        }
    }

}