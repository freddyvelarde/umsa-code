num = int(input())

for _ in range(num):
    
    n = int(input())
    matrix = [[0]*n for i in range(n)]

    dx = [0, 1, -1]
    dy = [1, -1, 0]

    pos, x, y, value = 0, 0, 0, 1

    for i in range(n*(n + 1) // 2):
        matrix[x][y] = value 
        value += 1
        if x + dx[pos] < 0 or x + dx[pos] >= n or y + dy[pos] < 0 or y + dy[pos] >= n or matrix[x + dx[pos]][y + dy[pos]] != 0:
            pos = (pos + 1) % 3
        x += dx[pos]
        y += dy[pos]

    for i in range(n):
        for j in range(n):
            if j == n - 1:
                print(matrix[i][j])
            else:
                print(matrix[i][j], end=' ')
    print()





