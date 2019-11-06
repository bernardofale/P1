import java.util.*;

public class ex117 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Insira o valor bruto da fatura: ");
	double vB = sc.nextDouble();

	System.out.print("Insira o desconto caso tenha: ");
	double desc = sc.nextDouble();

	System.out.print("Insira o valor do IVA: ");
	double iva = sc.nextDouble();


	double vL = vB - (vB * (desc*0.1));
	double vLF = vL + (vL * (iva*0.1));

	System.out.printf("O valor líquido final é " + vLF + " euros.");

	}
}
