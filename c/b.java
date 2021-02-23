import java.util.*;

public class b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int[] a = new int[M];

			for (int j = 0; j < M; j++) {
				a[j] = sc.nextInt();
			}

			int point = 0;

			for (int j = 0; j < M; j++) {
				if (a[j] == K) {
					point += 1;
				}
			}
			System.out.println(point);

		}
	}
}