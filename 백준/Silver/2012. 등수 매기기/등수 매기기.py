import sys
input = sys.stdin.readline
N = int(input())
ranks = [i for i in range(1,N+1)]
people = []
for _ in range(N):
    people.append(int(input()))
people.sort()
answer = 0
for j in range(len(people)):
    answer += abs(ranks[j] - people[j])
print(answer)