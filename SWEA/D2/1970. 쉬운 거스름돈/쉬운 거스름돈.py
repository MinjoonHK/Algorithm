T = int(input())
money_list = [50000, 10000, 5000, 1000, 500, 100, 50, 10]
for i in range(1, T + 1):
    user_input = int(input())
    counter = 0
    result = []
    for j in range(len(money_list)):
        result.append(user_input // money_list[j])
        user_input -= money_list[j] *(user_input // money_list[j])
    print(f"#{i}")
    print(*result)
