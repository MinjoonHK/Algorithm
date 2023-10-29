def solution(brown, yellow):
    answer = []
    multiple = []
    horizontal = 0
    vertical = 0
    for i in range(1,yellow+1):
        if yellow % i == 0:
            multiple.append(i)
    for j in multiple:
        temp = yellow / j
        horizontal = j + 2
        vertical = temp + 2
        if brown == horizontal * 2 + (vertical - 2) * 2:
            answer.append(vertical)
            answer.append(horizontal)
            break
    return answer