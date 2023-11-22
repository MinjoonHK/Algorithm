N = int(input())
arr1 = list(map(int,input().split()))
M = int(input())
arr2 = list(map(int,input().split()))

dict1 = {}
for card in arr1:
    if card in dict1:
        dict1[card] += 1
    else:
        dict1[card] = 1

for j in arr2:
    result = dict1.get(j)
    if result == None:
        print(0,end=' ')
    else:
        print(result,end=' ')

