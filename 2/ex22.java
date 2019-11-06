import java.util.*;

public class ex22 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    double n1,n2;

    System.out.print("Insira o número 1-> ");
    n1=sc.nextDouble();
    System.out.print("Insira o número 2-> ");
    n2=sc.nextDouble();

    if(n1>n2){
      System.out.print("O número 1 é maior que o número 2!");
    }else if(n1<n2){
      System.out.print("O número 2 é maior que o número 1!");
    }else{
      System.out.print("Os números são iguais!");
    }
  }
}
