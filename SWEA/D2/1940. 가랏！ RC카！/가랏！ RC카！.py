T = int(input())
for i in range(1,T+1):
    user_input = int(input())
    result = 0
    speed = 0
    for j in range(user_input):
        user_command = input().split()
        if int(user_command[0]) == 1:
            speed += int(user_command[1])
            result += speed

        elif int(user_command[0]) == 0:
            result += speed

        elif int(user_command[0]) == 2:
            speed -= int(user_command[1])
            if speed < 0:
                speed = 0
            result += speed

    print(f"#{i}",result)