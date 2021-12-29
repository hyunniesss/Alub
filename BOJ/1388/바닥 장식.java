/**
* 메모리: 11632 KB, 시간: 80 ms
* 2021.12.29
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static char[][] map;
	static int R, C;

	public static void main(String[] args) {
//		- 만나면 오른쪽 탐색 , | 만나면 아래로 탐색
		initInput();
		int count = 0;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				if (map[r][c] == '-') {
					map[r][c] = '.';
					dfs(r, c, 0);
				} else if (map[r][c] == '|') {
					map[r][c] = '.';
					dfs(r, c, 1);
				} else {
					continue;
				}
				count++;
			}
		}
		System.out.println(count);
	}

	static int[][] dirs = { { 0, 1 }, { 1, 0 } };

	private static void dfs(int r, int c, int d) {
		int nr = r + dirs[d][0];
		int nc = c + dirs[d][1];
		if (canGo(nr, nc, d)) {
			map[nr][nc] = '.';
			dfs(nr, nc, d);
		}
	}

	private static boolean canGo(int r, int c, int d) {
		return r >= 0 && r < R && c >= 0 && c < C && (map[r][c] == (d == 0 ? '-' : '|'));
	}

	private static void initInput() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = null;
		try {
			str = new StringTokenizer(br.readLine(), " ");
			R = Integer.parseInt(str.nextToken());
			C = Integer.parseInt(str.nextToken());
			map = new char[R][C];
			for (int i = 0; i < R; i++) {
				map[i] = br.readLine().toCharArray();
			}
		} catch (IOException e) {
		}

	}

}
