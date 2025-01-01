N = int(input())
userInputList = list(map(int,input().split()))
fixedUserInputList = [x / max(userInputList) * 100 for x in userInputList]
print(sum(fixedUserInputList) / N)