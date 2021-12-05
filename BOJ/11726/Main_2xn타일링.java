/**
* 메모리: 12908 KB, 시간: 108 ms
* 2021.12.05
* by Alub
*/
import java.util.Scanner;

public class Main {
    
    static int[] dp;
	
	public static void main(String[] args) {
		int n=-1;
		try(Scanner sc = new Scanner(System.in)){
			n = sc.nextInt();
            dp = new int[n+1];
		}
		dp[0] = 1; dp[1] = 1;
		int result = dfs(n);
		System.out.println(result);
		
	}

	private static int dfs(int n) {
		if(dp[n]!=0){
            return dp[n];
        }
		return dp[n]=(dfs(n-1)%10007 + dfs(n-2)%10007)%10007;
		
	}

}