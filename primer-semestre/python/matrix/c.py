def main(n):
    matrix = []
    num = 0
    for i in range(n):
        matrix.append([])
        for j in range(n):
            if num % 2 == 0:
                matrix[i].append((j + 1) % 2)
            else:
                matrix[i].append(j % 2)
        num += 1
    return matrix
 
def printMatrix(matrix):
    for arr in matrix:
        word = ""
        for num in arr:
            word += str(num)
        print(word)
 
# RUNNING CODE
n = int(input())
matrix = main(n)
printMatrix(matrix)
