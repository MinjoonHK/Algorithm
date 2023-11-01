def solution(k, m, score):
    answer = 0
    arr = []
    score.sort()
    for i in range(len(score),-1,-m):
        arr.append(score[i:i+m])
    arr.pop(0)
    for j in arr:
        answer += min(j) * m
    
    return answer