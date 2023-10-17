def solution(s):
    temp = list(s.split())
    return min(temp, key=int) + ' ' + max(temp,key = int)