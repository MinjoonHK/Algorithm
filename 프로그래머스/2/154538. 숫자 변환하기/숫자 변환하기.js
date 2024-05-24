function solution(x, y, n) {
    let dp = Array(1000001).fill(0);
    dp[x] = 1;
    for(let i=x; i<dp.length; i++){
        if(i == y){
            return dp[i] == 0 ? -1 : dp[i] -1;
        }
        if(dp[i] != 0){
            dp[i*2] = dp[i*2] < dp[i] + 1 ? dp[i*2] != 0 ? dp[i*2] : dp[i] + 1 : dp[i] + 1;
            dp[i+n] = dp[i+n] < dp[i] + 1 ? dp[i+n] != 0 ? dp[i+n] : dp[i] + 1 : dp[i] + 1;
            dp[i*3] = dp[i*3] < dp[i] + 1 ? dp[i*3] != 0 ? dp[i*3] : dp[i] + 1 : dp[i] + 1;
            
        }
    }
}