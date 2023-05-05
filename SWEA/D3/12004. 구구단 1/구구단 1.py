T = int(input())
for tc in range(1,T+1):
    user_input = int(input())
    check = 0
    for i in range(1,10):
        multiplier = 0
        for j in range(1,10):
            if i * j == user_input:
                check = 1
                break
    if check == 1:
        print(f"#{tc}","Yes")
    else:
        print(f"#{tc}","No")


