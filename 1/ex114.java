import java.util.*;

public class ex114 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Comprimento dos catetos A e B: ");
	double cA = sc.nextDouble();
	double cB = sc.nextDouble();

	double hip = (cA*cA) + (cB*cB);

	System.out.printf("O comprimento da hipotenusa é %.2f cm", hip);
	}
}
