N = int(input())
counter = 0
while True:
    if N - 3 == 0 or N - 1 == 0:
        counter += 1
        break
    if N - 3 == 2:
        N -= 3
        counter += 1
    else:
        N -= 1
        counter += 1
if counter % 2 == 0:
    print("CY")
else:
    print("SK")
