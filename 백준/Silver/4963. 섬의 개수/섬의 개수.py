import sys
sys.setrecursionlimit(50000000)
input = sys.stdin.readline

def explore_island(grid, row, col):
    # 상하좌우 대각선으로 연결된 땅을 탐색하는 함수
    if row < 0 or row >= len(grid) or col < 0 or col >= len(grid[0]) or grid[row][col] != 1:
        return

    grid[row][col] = -1  # 방문한 땅을 -1로 표시

    # 인접한 8개의 방향을 확인
    directions = [(1, 0), (-1, 0), (0, 1), (0, -1), (1, 1), (-1, -1), (1, -1), (-1, 1)]
    for dx, dy in directions:
        explore_island(grid, row + dx, col + dy)


def count_islands(grid):
    count = 0

    # 모든 정사각형을 탐색하며 땅을 찾음
    for row in range(len(grid)):
        for col in range(len(grid[0])):
            if grid[row][col] == 1:
                count += 1
                explore_island(grid, row, col)

    return count


while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break

    # 지도 입력 받기
    grid = []
    for _ in range(h):
        row = list(map(int, input().split()))
        grid.append(row)

    # 섬의 개수 출력
    print(count_islands(grid))
