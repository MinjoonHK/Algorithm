def solution(s):
    answer = []
    temp = ''
    for i in range(len(s)):
        if temp.find(s[i]) == -1:
            temp += s[i]
            answer.append(-1)
        elif temp.find(s[i]) != -1:
            answer.append(i - temp.rfind(s[i]))
            temp += s[i]
            
            
    
    return answer