import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, result;
    static char[] input;

    public static void main(String[] args) throws NumberFormatException, IOException {
        /*
         * 80ms
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        input = new char[N];

        input = br.readLine().toCharArray();

        result = Integer.MIN_VALUE;
       
        solve(2, input[0] - '0');
        System.out.println(result);
    }

    private static void solve(int i, int sum) {

        if (i >= N) {
            result = Math.max(result, sum);
            return;
        }

       
        solve(i+2, cal(sum, input[i]-'0', input[i-1]));

        
        if (i + 2< N) {
            
            int right = cal(input[i]-'0', input[i+2]-'0' , input[i+1]);
            
            int left = cal(sum, right, input[i-1]);
            solve(i+4, left);
        }
    }

    private static int cal(int i, int j, char op) {
        if (op == '+')
            return i + j;
        else if (op == '-')
            return i - j;
        else
            return i * j;
    }
}