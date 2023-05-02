T = int(input())
for tc in range(1,T+1):
    user_input = int(input())
    if user_input % 2 == 0:
        print(f"#{tc}","Alice")
    else:
        print(f"#{tc}","Bob")