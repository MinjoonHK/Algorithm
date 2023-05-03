T = int(input())
for tc in range(1,T+1):
    user_input = int(input())
    counter = 0
    for x in range(-user_input,user_input+1):
        for y in range(-user_input,user_input+1):
            if x**2 + y**2 <= user_input**2:
                counter+=1
    print(f"#{tc}",counter)
