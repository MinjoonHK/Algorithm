T = int(input())

for t in range(1, T + 1):
    word = input()
    L = 4 * len(word) + 1
    arr = [["."] * L for _ in range(5)]

    cnt = 0
    for i in range(2, L, 4):
        arr[0][i] = "#"
        arr[1][i - 1] = "#"
        arr[1][i + 1] = "#"
        arr[2][i + 2] = "#"
        arr[2][i - 2] = "#"
        arr[2][i] = word[cnt]
        arr[3][i + 1] = "#"
        arr[3][i - 1] = "#"
        arr[4][i] = "#"
        cnt += 1

    for a in arr:
        for e in a:
            print(e, end="")
        print()