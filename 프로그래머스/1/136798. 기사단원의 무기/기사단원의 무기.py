def solution(number, limit, power):
    answer = 0
    for i in range(1,number +1):
        temp = 0
        for j in range(1,int(i**0.5)+1):
            if i % j == 0:
                temp += 1
                if j ** 2 != i:
                    temp += 1
        if temp <= limit:
            answer += temp
        else:
            answer += power
    return answer