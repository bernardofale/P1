import java.util.*;

public class ex28 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

		String nmrs;

		System.out.print("Insira três números inteiros(nmr1,nmr2,nmr3)-> ");
		nmrs=sc.nextLine();
		String[] nmr=nmrs.split(",");

		int nmr1=Integer.parseInt(nmr[0]);
		int nmr2=Integer.parseInt(nmr[1]);
		int nmr3=Integer.parseInt(nmr[2]);

		if(nmr1>nmr2 && nmr1>nmr3 && nmr2>nmr3){
			System.out.printf("%d,%d,%d", nmr3,nmr2,nmr1);
		}else if(nmr2>nmr1 && nmr2>nmr3 && nmr3>nmr1){
			System.out.printf("%d,%d,%d", nmr1, nmr3, nmr2);
		}else if(nmr3>nmr1 && nmr3>nmr2 && nmr2>nmr1){
			System.out.printf("%d,%d,%d", nmr1, nmr2, nmr3);
		}else if(nmr1>nmr2 && nmr1>nmr3 && nmr3>nmr2){
			System.out.printf("%d,%d,%d",nmr2,nmr3,nmr1);
		}else if(nmr2>nmr1 && nmr2>nmr3 && nmr1>nmr3){
			System.out.printf("%d,%d,%d",nmr3,nmr1,nmr2);
		}else if(nmr3>nmr1 && nmr3>nmr2 && nmr1>nmr2){
			System.out.printf("%d,%d,%d", nmr2,nmr1,nmr3);
				}
			}
		}
