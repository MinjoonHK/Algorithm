def solution(clothes):
    dict1 = {}
    for i in range(len(clothes)):
        if clothes[i][1] in dict1:
            dict1[clothes[i][1]] += 1
        else:
            dict1[clothes[i][1]] = 1
    temp = 1
    for j in dict1.values():
        	temp *= (j+1)
    return temp - 1