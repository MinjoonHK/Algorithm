N = int(input())
arr = [input() for _ in range(N)]
uniqueArr = set(arr)
sortedUniqueArr = sorted(uniqueArr, key= lambda x: (len(x),x))
print("\n".join(sortedUniqueArr))