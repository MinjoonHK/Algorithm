def solution(n):
    answer = 0
    fibo = [0 for i in range(n+1)]
    fibo[0] = 0
    fibo[1] = 1
    for i in range(2,n+1):
        fibo[i] = fibo[i-1] + fibo[i-2]
    answer = fibo[-1] % 1234567
    return answer