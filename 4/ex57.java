import java.util.*;
public class ex57{
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Insira dois números(x,y) onde x>y: ");
        String a=sc.nextLine();
        String[] aa=a.split(",");

        System.out.print(mdc(Integer.parseInt(aa[0]), Integer.parseInt(aa[1])));

    }
    public static int mdc(int x, int y){
        int resto;
        while(y!=0){
            resto=x%y;
            x=y;
            y=resto;
        }
        return x;
    }

}