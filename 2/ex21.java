import java.util.*;

public class ex21 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

		double tpg1=0;
		double tpg2=0;
		double ei=0;
		double notafinal=0;
		
		assert tpg1<20 && tpg1>0;
		assert tpg2<20 && tpg2>0;
		assert ei<20 && ei>0;

		System.out.print("Nota TPG1-> ");
		tpg1=Double.parseDouble(sc.nextLine());
		System.out.print("Nota TPG2-> ");
		tpg2=Double.parseDouble(sc.nextLine());
		System.out.print("Nota EI-> ");
		ei=Double.parseDouble(sc.nextLine());

		notafinal=(tpg1*0.2)+(tpg2*0.3)+(ei*0.5);

		if(notafinal<9.5){
			System.out.print("Aluno reprovado.");
		}else{
			System.out.print("Aluno aprovado!");
		}
	}
}
