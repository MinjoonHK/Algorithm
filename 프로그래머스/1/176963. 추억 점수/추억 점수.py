def solution(name, yearning, photo):
    answer = []
    for i in range(len(photo)):
        temp = 0
        for j in range(len(photo[i])):
            if photo[i][j] in name:
            	temp += yearning[name.index(photo[i][j])]
            else:
                continue
        answer.append(temp)
            
    return answer