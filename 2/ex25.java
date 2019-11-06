import java.util.*;

public class ex25 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

	String p1,p2,p3,p4;

	System.out.print("Insira as coordenadas do ponto 1(x,y)-> ");
	p1=sc.nextLine();
	String[] p1c=p1.split(",");
	System.out.print("Insira as coordenadas do ponto 2(x,y)-> ");
	p2=sc.nextLine();
	String[] p2c=p2.split(",");
	System.out.print("Insira as coordenadas do ponto 3(x,y)-> ");
	p3=sc.nextLine();
	String[] p3c=p3.split(",");
	System.out.print("Insira as coordenadas do ponto 4(x,y)-> ");
	p4=sc.nextLine();
	String[] p4c=p4.split(",");

	double p1p2=distancia(Double.parseDouble(p1c[0]), Double.parseDouble(p2c[0]), Double.parseDouble(p1c[1]), Double.parseDouble(p2c[1]));
	double p2p3=distancia(Double.parseDouble(p2c[0]), Double.parseDouble(p3c[0]), Double.parseDouble(p2c[1]), Double.parseDouble(p3c[1]));
	double p3p4=distancia(Double.parseDouble(p3c[0]), Double.parseDouble(p4c[0]), Double.parseDouble(p3c[1]), Double.parseDouble(p4c[1]));
	double p4p1=distancia(Double.parseDouble(p4c[0]), Double.parseDouble(p1c[0]), Double.parseDouble(p4c[1]), Double.parseDouble(p1c[1]));

	if(p1p2==p2p3 && p2p3==p3p4 && p3p4==p4p1){
		System.out.print("A figura é um quadrado!");
	}else{
		System.out.print("A figura não é um quadrado!");
	}
}

	public static double distancia(double x0, double x1, double y0, double y1){

        return Math.sqrt(Math.pow( (x0 - x1) , 2) + Math.pow( (y0 - y1) , 2));
    }
	}
