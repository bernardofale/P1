import java.util.*;

public class ex210 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
		int dia,mes,ano;
		boolean bissexto=false;
		System.out.print("Insira uma data(dd-mm-aa)-> ");
		String d=sc.nextLine();
		String[] data=d.split("-");
		dia=Integer.parseInt(data[0]);
		mes=Integer.parseInt(data[1]);
		ano=Integer.parseInt(data[2]);

		if(ano%4==0 && ano%100!=0 || ano%400==0){
			bissexto=true;
		}

		if(bissexto==true && mes==2 && dia==28){
			dia=29;
		}
		if(bissexto!=true && mes==2 && dia==28){
			dia=1;
		}

		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10){
			mes++;
			dia=1;
		}
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 && dia==30){
			dia++;
		}
		if(mes==2 || mes==4 || mes==6 || mes==9 || mes==11 & dia==30){
			mes++;
			dia=1;
		}
		if(dia==31 && mes==12){
			ano++;
			mes=1;
			dia=1;
		}
		if(dia<30){
			dia++;
		}

		System.out.printf("O dia seguinte é %d-%d-%d",dia,mes,ano);
	}
}
