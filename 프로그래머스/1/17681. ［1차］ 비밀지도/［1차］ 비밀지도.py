def solution(n, arr1, arr2):
    answer = []
    
    for i in range(len(arr1)):
        value = ''
        temp1 = list(bin(arr1[i])[2:].zfill(n))
        temp2 = list(bin(arr2[i])[2:].zfill(n))
        for j in range(n):
            if temp1[j] == '1' or temp2[j] == '1':
                value += "#"
            else:
                value += " "
        answer.append(value)
    return answer