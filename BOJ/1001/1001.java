/**
* 메모리: 11508 KB, 시간: 84 ms
* 2021.11.19
* by Alub
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			System.out.println(Integer.parseInt(str.nextToken()) 
					- Integer.parseInt(str.nextToken()));
		} catch (Exception e) {

		}

	}

}