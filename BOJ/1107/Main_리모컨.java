/**
* 메모리: 91536 KB, 시간: 244 ms
* 2021.11.30
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 1000001;
	static int N; // 이동하려는 채널
	static boolean[] number = new boolean[10]; // 사용할 수 없는 번호(true)

	public static void main(String[] args) {

		initInput();
		int cur = 100; // 현재 채널
		if (N == cur) { // 이동하려는 채널이 현재 채널인 경우
			System.out.println(0);
			return;
		}
		// 방법 1. 현재채널에서 + 또는 - 만으로 이동
		int min = Math.abs(N - cur);
        
        // 방법 4. 0번부터 MAX까지 누를 수 있는 모든 채널에서 +, - 로 이동
		for(int i=0;i<MAX;i++) {
			int cnt = canGo(i);
			if(cnt > 0) {	// 갈 수 있으면 +,-로 갈 수 있는 거리 측정
				min = Math.min(cnt + Math.abs(N - i), min);
			}
		}
		
		System.out.println(min);
	}

	private static int canGo(int i) {
		int cnt = 0;
		for(char c : (i+"").toCharArray()) {
			if(number[c-'0']) {
				return 0;
			}
			cnt++;
		}
		return cnt;
	}

	private static void initInput() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			N = Integer.parseInt(br.readLine());

			int M = Integer.parseInt(br.readLine());
			if (M > 0) {
				StringTokenizer str = new StringTokenizer(br.readLine(), " ");

				while (M-- > 0) {
					number[Integer.parseInt(str.nextToken())] = true;
				}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}
}