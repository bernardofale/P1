import java.util.*;

public class ex110 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);


	System.out.print("Temperatura em Celsius: ");
	double temp = sc.nextDouble();

	double F = 1.8*temp+32;

	System.out.printf(temp + " graus Celsius equivalem a " + F + " graus Fahrenheit");
	}
}
