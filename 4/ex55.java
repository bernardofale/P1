import java.util.*;
public class ex55{
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Insira a largura e a altura do retângulo(l,a): ");
        String x=sc.nextLine();
        String[] la=x.split(",");

        printNtime(Integer.parseInt(la[0]),Integer.parseInt(la[1]), "*");

    }
    public static void printNtime(int l,int a,String s){
        String f="";
        String w="";
        String esp=" ";

        for (int i = 1; i <= l; i++) {
            f+=s;
        }
        System.out.print(f);
        System.out.println("");

        for(int j = 1; j<=a-2 ; j++){
            for (int k = 1; k<=l; k++) {
                if(k==l){
                    System.out.print(s);
                    System.out.print("\n");
                }else if(k==1){
                    System.out.print(s);
                }else{
                    System.out.print(esp);
                }
            }
        }
        if(a!=1){
            for (int i = 0; i < l; i++) {
                w+=s;
            }
            System.out.print(w);
            System.out.print("\n");    
        }
    }
}