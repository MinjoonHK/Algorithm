alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z']
T = int(input())
for tc in range(1, T + 1):
    user_input = str(input())
    counter = 0
    for i in range(len(user_input)):
        if user_input[i] != alphabet[i]:
            break
        if user_input[i] == alphabet[i]:
            counter += 1
    print(f"#{tc}",counter)
