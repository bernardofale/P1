import java.util.*;

public class ex24 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
		String data;
		int mes,ano,dias;
		boolean bissexto=false;;
		System.out.print("Insira a data(mm-aa)-> ");
		data=sc.nextLine();
		String[] date=data.split("-");
		mes=Integer.parseInt(date[0]);
		ano=Integer.parseInt(date[1]);

		if(ano%4==0 && ano%100!=0 || ano%400==0){
			bissexto=true;
		}
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			dias=31;
		}else if(mes==2 && bissexto==true){
			dias=29;
		}else if(mes==2 && bissexto!=true){
			dias=28;
		}else{
			dias=30;
		}
		System.out.printf("O mês "+mes+" do ano "+ano+" tem "+dias+" dias!");
	}
}
