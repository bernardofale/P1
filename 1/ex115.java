import java.util.*;

public class ex115 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Nota TP1: ");
	double tp1 = sc.nextDouble();

	System.out.print("Nota TP2 ");
	double tp2 = sc.nextDouble();

	System.out.print("Nota API: ");
	double api = sc.nextDouble();

	System.out.print("Nota EP: ");
	double ep = sc.nextDouble();

	double notafinal = tp1* 0.15 + tp1 * 0.15 + api * 0.30 + ep * 0.40;

	System.out.printf("A nota final de P1 é de %.2f valores.", notafinal);

	}
}
