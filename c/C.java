import java.util.*;
import java.util.Arrays;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] sg = new String[N];

		for (int i = 0; i < N; i++) {
			String g = sc.next();
			String s = sc.next();

			if (s.length() == 1) {
				s = "0" + s;
			}

			if (g.length() == 1) {
				g = "0" + g;
			}

			sg[i] = s + g;
		}

		Arrays.sort(sg, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			System.out.println(Integer.parseInt(sg[i].substring(2, 4)) + " " + Integer.parseInt(sg[i].substring(0, 2)));
		}
	}
}