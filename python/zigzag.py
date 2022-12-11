

def printArr(arr):
    res = ''
    for num in arr:
        res += str(num) + ' '
    return print(res[:-1])


def zigZagTraverse(n, m):
    matrix = [[0 for _ in range(m)] for _ in range(n)]
    
    row, col = 0, 0

    counter = 1
    going_up = False

    while row < n and row >= 0 and col < m and col >= 0:
        if going_up:
            i = row 
            while i >= 0 and col < m:
                matrix[i][col] = counter
                counter += 1
                col += 1
                i -= 1
            if col == m:
                col -= 1
                row = i + 2
            else:
                row = i + 1
        else: 
            i = row 
            while i < n and col >= 0:
                matrix[i][col] = counter
                counter += 1
                col -= 1
                i += 1
            if i == n:
                row = i - 1
                col += 2
            else:
                row = i 
                col += 1
        going_up = not going_up
    
    for arr in matrix:
        printArr(arr)


# RUNNIG CODE
n,m  = map(int, input().split())
zigZagTraverse(n, m)
