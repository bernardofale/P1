import java.util.*;
public class ex53{
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Insira a data(mm-aa)-> ");
		String d=sc.nextLine();
		String[] date=d.split("-");
		int mes=Integer.parseInt(date[0]);
		int ano=Integer.parseInt(date[1]);
        System.out.print(f(mes, ano));
        
        if(f(mes,ano)==0){
            System.out.print("Ano tem de ser maior que 0.");
        }
        
    }
    public static int f(int mes, int ano){
        int dias;
        boolean bissexto=false;
        if(ano>0){
		if(ano%4==0 && ano%100!=0 || ano%400==0){
			bissexto=true;
		}
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			return dias=31;
		}else if(mes==2 && bissexto==true){
			return dias=29;
		}else if(mes==2 && bissexto!=true){
			return dias=28;
		}else{
			return dias=30;
        }
    }
    return 0;
    }}