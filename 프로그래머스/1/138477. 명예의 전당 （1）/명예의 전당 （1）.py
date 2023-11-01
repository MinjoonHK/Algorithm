def solution(k, score):
    answer = []
    arr = []
    for i in range(len(score)):
        if i <= k - 1:
            arr.append(score[i])
        else:
            if score[i] > min(arr):
                arr.pop(arr.index(min(arr)))
                arr.append(score[i])
        answer.append(min(arr))
    return answer