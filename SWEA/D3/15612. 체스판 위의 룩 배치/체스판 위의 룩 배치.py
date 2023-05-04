T = int(input())
for tc in range(1,T+1):
    board = [list(map(str,input())) for _ in range(8)]
    check = 1
    check_x = 0
    check_y = 0
    for i in range(8):
        temp = []
        check_x += board[i].count("O")
        if board[i].count("O") > 1:
            check = 0
            break
        for j in range(8):
            temp.append(board[j][i])
        check_y += temp.count("O")
        if temp.count("O") > 1:
            check = 0
            break
    if check == 1 and check_x + check_y == 16:
        print(f"#{tc}","yes")
    else:
        print(f"#{tc}","no")