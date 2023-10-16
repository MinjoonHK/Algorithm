def solution(left, right):
    answer = 0
    for i in range(left,right+1):
        counter = 0
        for j in range(1,i+1):
            if i % j == 0:
                counter += 1
        if counter % 2 == 0:
            answer += i
        elif counter % 2 != 0:
            answer -= i
            
    return answer