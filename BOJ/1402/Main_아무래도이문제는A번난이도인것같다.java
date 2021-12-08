/**
* 메모리: 11588 KB, 시간: 76 ms
* 2021.12.08
* by Alub
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        initInput();
        System.out.println(sb.toString());
    }
    
    private static void initInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int T = Integer.parseInt(br.readLine());
            while(T-- >0){
                br.readLine();
                sb.append("yes\n");
            }
        } catch(Exception e){}
    }
    
}