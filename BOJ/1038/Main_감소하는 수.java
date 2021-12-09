/**
* 메모리: 19488 KB, 시간: 112 ms
* 2021.12.09
* by Alub
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// 입력
		int N = -1;
		try {
			N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (Exception e) {
		}
		if (N <= 10) {
			System.out.println(N);
			return;
		}
		long[] arr;
		try {
			arr = new long[N + 1];

			for (int i = 0; i < 10; i++) {
				arr[i] = i;
			}
			int i = 10, j = 0;
			while (i <= N) {
				long temp = arr[j] * 10;
				while (i <= N && arr[j] % 10 > temp % 10) {
					arr[i++] = temp++;
				}
				j++;
			}
			System.out.println(arr[N]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(-1);
		}
	}

}
