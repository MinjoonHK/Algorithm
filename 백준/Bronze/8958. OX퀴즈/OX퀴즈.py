N = int(input())
for i in range(N):
    score = 1
    result = 0
    userInput = list(input())
    for j in userInput:
        if j == 'O':
            result += score
            score += 1
        else:
            score = 1
    print(result)