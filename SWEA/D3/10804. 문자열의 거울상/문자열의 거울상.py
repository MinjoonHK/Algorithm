T = int(input())

for i in range(1,T+1):
    arr = list(str(input()))[::-1]
    answer = ''
    for j in arr:
        if j == "b":
            answer += "d"
        if j == "d":
            answer += "b"
        if j == "p":
            answer += "q"
        if j == "q":
            answer += "p"
    print(f"#{i}",answer)
