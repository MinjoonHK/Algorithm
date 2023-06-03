def solution(n):
    sum = 0
    if n % 2 == 0:
        for i in range(1,n+1):
            if i % 2 == 0:
                sum += i * i            
    else:
        for i in range(1,n+1):
            if i % 2 != 0:
                sum += i
    answer = sum
    return answer