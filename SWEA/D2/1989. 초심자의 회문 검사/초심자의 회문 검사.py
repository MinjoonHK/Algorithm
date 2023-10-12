T = int(input())
for i in range(1,T+1):
    word = list(str(input()))
    if word == word[::-1]:
        print(f"#{i}", 1)
    else:
        print(f"#{i}", 0)
