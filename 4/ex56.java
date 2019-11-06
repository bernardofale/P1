import java.util.*;
public class ex56{
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Número(<100): ");
        int n=sc.nextInt();

        if(n<100 && n>0){
            System.out.printf("-----------------"+"\n"+
                            "| Tabuada dos %d |" +"\n"+
                            "-----------------"+"\n", n);
            for (int i = 1; i <= n; i++) {
                System.out.printf("| %d x %d = %d | \n", n, i,calcular(n,i));
            }
        }else{
            System.out.print("erro");
            System.exit(1);
        }
            

    }
public static int calcular(int n, int i){
       int x=n*i;
       return x;
    }
}
