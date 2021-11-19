/**
* 메모리: 11520 KB, 시간: 80 ms
* 2021.11.19
* by Alub
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		int answer = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			answer = Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken());
		} catch (Exception e) {
		}
		System.out.println(answer);
	}

}