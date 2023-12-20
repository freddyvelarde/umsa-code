
def printArr(arr):
    res = ''
    for num in arr:
        res += str(num) + ' '
    return print(res[:-1])


def zigZagTraverse(n):
    matrix = [[0 for _ in range(n)] for _ in range(n)]
    
    row, col = 0, 0

    counter = 1
    going_up = False

    while row < n and row >= 0 and col < n and col >= 0:
        if going_up:
            i = row 
            while i >= 0 and col < n:
                matrix[i][col] = counter
                counter += 1
                col += 1
                i -= 1
            if col == n:
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
n = int(input())
zigZagTraverse(n)
