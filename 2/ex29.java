import java.util.*;

public class ex29 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
		String choice;
		do{
			System.out.print("0-> Celsius \n");
			System.out.print("1-> Fahrenheit \n");
			System.out.print("Opção-> ");
			choice=sc.nextLine();
			switch(choice){
				case "0":
					System.out.print("Insira a temperatura em celsius-> ");
					Double celsius=sc.nextDouble();
					Double F=1.8*celsius+32;
					System.out.printf("%.2fº graus celsius equivalem a %.2fº Fahrenheit! \n", celsius, F);

				case "1":
				System.out.print("Insira a temperatura em fahrenheit-> ");
				Double f=sc.nextDouble();
				Double c =(f-32)/1.8;
				System.out.printf("%.2fº graus celsius equivalem a %f.2º Fahrenheit! \n", c, f);
			}
		}while(!choice.equals("q"));
	}
}
