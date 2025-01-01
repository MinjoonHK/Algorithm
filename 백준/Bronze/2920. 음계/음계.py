tempList = list(map(int,input().split()))
if tempList == sorted(tempList):
    print("ascending")
elif tempList == sorted(tempList, reverse=True):
    print("descending")
else:
    print("mixed")