import java.util.*;

public class ex19 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

double largura, comprimento;

System.out.print("largura do retangulo: ");
largura = sc.nextDouble();

System.out.print("comprimento do retangulo: ");
comprimento = sc.nextDouble();

double resultado = largura * comprimento;

System.out.printf("a área é: " + resultado);

	}
}
