import math

def solution(arr):
    answer = arr[0]
    for i in arr:
        answer = answer * i // math.gcd(answer,i)
    return answer