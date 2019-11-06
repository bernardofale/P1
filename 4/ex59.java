import java.util.*;

public class ex59{
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Insira um número: ");
        int x=sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
            System.out.println(isprime(i));
        }
    }
public static boolean isprime(int n){
    int cont=0;

    for (int i = 1; i <= n; i++) {
        if(n%i==0){
            cont++;
        }
    }

    if(cont==2){
        return true;
        }
    return false;
    }
}