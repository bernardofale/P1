import java.util.*;

public class ex27 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

		String nmrs;

		System.out.print("Insira três números inteiros(nmr1,nmr2,nmr3)-> ");
		nmrs=sc.nextLine();
		String[] nmr=nmrs.split(",");

		int nmr1=Integer.parseInt(nmr[0]);
		int nmr2=Integer.parseInt(nmr[1]);
		int nmr3=Integer.parseInt(nmr[2]);

		if(nmr1>nmr2 && nmr1>nmr3){
			System.out.print("O número 1 é o maior!");
		}else if(nmr2>nmr1 && nmr2>nmr3){
			System.out.print("O número 2 é o maior!");
		}else{
			System.out.print("O número 3 é o maior!");
		}
	}
}
