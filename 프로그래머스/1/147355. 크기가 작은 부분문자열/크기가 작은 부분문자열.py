def solution(t, p):
    arr = []
    answer = 0
    for i in range(len(t)-len(p)+1):
        arr.append(t[i:i+len(p)])
    for j in arr:
        if int(j) <= int(p):
            answer += 1
    return answer