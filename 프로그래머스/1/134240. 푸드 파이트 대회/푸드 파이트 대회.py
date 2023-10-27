def solution(food):
    player1 = []
    player2 = []
    for i in range(1,len(food)):
        for j in range(food[i] // 2):
            player1.append(str(i))
    for j in range(len(food)-1,0,-1):
        for i in range(food[j] // 2):
            player2.append(str(j))
    answer = player1 + [str(0)] + player2
    return ''.join(answer)