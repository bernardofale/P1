import java.util.*;
public class ex52{
    public static void main (String args[]) {

        System.out.printf("%4.2f \n",f(10));
        System.out.println(max(3.1,8.2));
        System.out.println(poly3(2,3,4,5,2));
        System.out.println(fact(4));
        getPosInt();
        System.out.println(getIntRange(8,20));
        printNtime(3, "esketit");

    }

    public static double f(int n){
        double x=1/(1+(n*n));
        return x;
    }
    public static double max(double x, double y){
        if(x>y) return x;

        return y;
    }
    public static int max(int x, int y){
        if(x>y) return x;

        return y;
    }
    public static double poly3(int a, int b, int c, int d, int x){
            double p;
            p=a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
            return p;

    }
    public static int fact(int n){
        int fac = 1;

        for(int i = 1; i <= n; i++)
        {
            fac *= i; 
        }

        return fac;
    }
    public static void getPosInt(){
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            System.out.print("Insira um número: ");
            x=Integer.parseInt(sc.nextLine());
        }while(x<0);
    }
    public static boolean getIntRange(int y, int z){
        Scanner sc=new Scanner(System.in);

        System.out.print("Insira um número dentro do limite: ");
        int x=Integer.parseInt(sc.nextLine());

        if(x>=y && x<=z)  return true;
        
        if(x>=z && x<=y)  return true;

        return false;

    }

    public static void printNtime(int x, String s){
        String f="";
        for (int i = 0; i < x; i++) {
            f+=s;
        }
        System.out.print(f);
    }
}