def solution(n):
    answer = 0
    temp = n
    while True:
        temp += 1
        if bin(n).count('1') == bin(temp).count('1'):
            answer += temp
            break
    return answer