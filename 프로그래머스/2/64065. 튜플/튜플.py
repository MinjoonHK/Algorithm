def solution(s):
    answer = []
    nested_lists = [list(map(int, inner.strip('{}').split(','))) for inner in s.strip('{}').split('},{')]
    nested_lists.sort(key = lambda x:len(x))
    for i in nested_lists:
        for j in i:
            if j in answer:
                continue
            else:
                answer.append(j)
    return answer