def digitsSum(n):
    digit_str = str(n)
    res = 0
    for num in digit_str:
        res += int(num)
    return res

def printArr(arr):
    res = ''
    for num in arr:
        res += str(num) + ' '
    return print(res[:-1])

def generateMatrix(n):
    matrix = [[0 for _ in range(n)] for _ in range(n)]

    left, right, top, bottom, num = 0, n - 1, 0, n - 1, 1

    while left <= right and top <= bottom:
        for j in range(left, right + 1):
            if num <= 9:
                matrix[top][j] = num
            else:
                matrix[top][j] = digitsSum(num)
            num += 1
        for i in range(top + 1, bottom):
            if num <= 9:
                matrix[i][right] = num
            else: 
                matrix[i][right] = digitsSum(num)
            num += 1
        for j in reversed(range(left, right + 1)):
            if top < bottom:
                if num <= 9:
                    matrix[bottom][j] = num
                else:
                    matrix[bottom][j] = digitsSum(num)
                num += 1
        for i in reversed(range(top + 1, bottom)):
            if left < right:
                if num <= 9:
                    matrix[i][left] = num
                else:
                    matrix[i][left] = digitsSum(num)
                num += 1
        left, right, top, bottom = left + 1, right - 1, top + 1, bottom - 1
    return matrix

# RUNNING CODE 

n = int(input())



for arr in generateMatrix(n):
    printArr(arr)
    # print("".join(arr))
