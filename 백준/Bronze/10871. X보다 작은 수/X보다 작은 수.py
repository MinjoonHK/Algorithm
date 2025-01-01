N,X = map(int,input().split())
tempList = filter(lambda x: x < X, list(map(int,input().split())))
print(" ".join(map(str,tempList)))