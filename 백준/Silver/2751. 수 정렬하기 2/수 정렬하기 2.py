import sys

N = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(N)]
sortedArr = sorted(arr)
print("\n".join(map(str, sortedArr)))