import java.util.*;

public class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String t = sc.next();
			int h = sc.nextInt();
			int m = sc.nextInt();

			int H = Integer.parseInt(t.substring(0, 2));
			int M = Integer.parseInt(t.substring(3, 5));

			int newH = H + h;
			int newM = M + m;

			if (newM >= 60) {
				newH += 1;
				newM -= 60;
			}

			if (newH >= 24) {
				newH -= 24;
			}

			String lastH = String.valueOf(newH);
			String lastM = String.valueOf(newM);

			if (lastH.length() == 1) {
				lastH = "0" + lastH;
			}

			if (lastM.length() == 1) {
				lastM = "0" + lastM;
			}

			System.out.println(lastH + ":" + lastM);
		}
	}
}