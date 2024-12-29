list = list(map(int, input().split()))
sum = 0
for i in list:
    sum += i * i

print(sum % 10)