def solution(x):
    temp = 0
    temp2 = x
    while temp2 > 0:
        temp += temp2 % 10
        temp2 //= 10
    if x % temp == 0:
        answer = True
    elif x % temp != 0:
        answer = False
    return answer