import java.util.*;

public class ex113 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Coordenadas da localidade A: ");
	int x1 = sc.nextInt();
	int y1 = sc.nextInt();


	System.out.println("Coordenadas da localidade B: ");
	int x2 = sc.nextInt();
	int y2 = sc.nextInt();

	double dist = 100 * Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));

	System.out.printf("A distância entre as localidades é de %f km", dist);

	}
}
