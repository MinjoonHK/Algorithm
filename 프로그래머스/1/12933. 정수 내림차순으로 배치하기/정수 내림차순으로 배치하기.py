def solution(n):
    num = list(str(n))
    num.sort(reverse=True)
    temp = ""
    for i in num:
        temp += i
    answer = int(temp)
    return answer