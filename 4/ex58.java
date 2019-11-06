import java.util.*;

public class ex58{
    public static void main (String args[]) {

        System.out.print("-------------------------------------------\n"+
                         "|  x  |  5x^2+10x+3  |   7x^3 +3x^2+5x+2  |\n"+
                         "-------------------------------------------\n");

        for (int i = 0; i < args.length; i++) {
            System.out.printf("| %s  |      %.2f      |         %.2f         |\n",args[i], 
                                poly3(0,5,10,3,Integer.parseInt(args[i])), poly3(7,3,5,2,Integer.parseInt(args[i])));

        }

    }
public static double poly3(int a, int b, int c, int d, int x){
            double p;
            p=a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
            return p;

    }
}