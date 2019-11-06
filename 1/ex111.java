import java.util.*;

public class ex111 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Quantos dólares pretende converter: ");
	double dolares = sc.nextDouble();

	System.out.print("Com a taxa de conversão a: ");
	double taxa = sc.nextDouble();

	double euros = dolares * taxa;

	System.out.println(dolares + " equivalem a " + euros + " euros");

	}
}
