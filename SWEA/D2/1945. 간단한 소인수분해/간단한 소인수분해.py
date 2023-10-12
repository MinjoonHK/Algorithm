T = int(input())

for tc in range(1, T+1):
    N = int(input())
    num_lst = [2,3,5,7,11]
    cnt_lst = [0,0,0,0,0]
    for i in range(5):
        while N % num_lst[i] == 0:
            cnt_lst[i] += 1
            N //= num_lst[i]
    print(f'#{tc} ', end='')
    print(*cnt_lst)