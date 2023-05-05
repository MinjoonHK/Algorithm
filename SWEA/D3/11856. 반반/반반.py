from collections import Counter
T = int(input())
for tc in range(1,T+1):
    user_input = str(input())
    count_user_input = Counter(user_input).most_common()
    if count_user_input[0][1] == 2 and count_user_input[1][1] == 2:
        print(f"#{tc}","Yes")
    else:
        print(f"#{tc}","No")
