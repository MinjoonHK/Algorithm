T = int(input())
for tc in range(1, T + 1):
    ball = False
    count = 0
    data = input()
    for d in data:
        if d == '|':
            if ball:
                ball = False
                count += 1
        elif d == '(':
            ball = True
        elif d ==')':
            ball = False
            count += 1
    print(f"#{tc}",count)