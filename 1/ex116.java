import java.util.*;

public class ex116 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Despesa diária do primeiro dia: ");
	double desp = sc.nextDouble();

	double d2 = desp + (desp * 0.2);
	double d3 = d2 + (d2 * 0.2);
	double d4 = d3 + (d3 * 0.2);

	double dmd = (desp + d2 + d3 + d4) / 4;

	System.out.printf("A despesa média diária foi %.2f euros", dmd);

	}
}
