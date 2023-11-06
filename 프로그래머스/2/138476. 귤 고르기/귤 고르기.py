def solution(k, tangerine):
    dict1 = {}
    for i in tangerine:
        if i in dict1:
            dict1[i] += 1
        else:
            dict1[i] = 1
    sorted_dict = sorted(dict1.items(), key= lambda x: x[1], reverse=True)
    answer = 0
    for j in sorted_dict:
        if k <= 0:
            break
        else:
            k -= j[1]
            answer += 1
    return answer