str = input()
result = []
for i in str:
    if ord(i) < 91:
        result.append(i.lower())
    elif ord(i) > 91:
        result.append(i.upper())
print(*result,sep='')