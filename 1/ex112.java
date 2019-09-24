import java.util.*;

public class ex112 {

public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

	int h, hr, m, mr, so, seg;
	System.out.print("Tempo em segundos: ");
	seg = sc.nextInt();
	h = seg/3600;
	hr = seg%3600;
	m = hr/60;
	mr = hr%60;
	so = mr%60;
	System.out.println("Tempo em hh:mm:ss: " + String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", so));

	}
}
