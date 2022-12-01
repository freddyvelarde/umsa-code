
def main(matrix):
    index_right = len(matrix[0]) - 1
    index_left = 0
    right = 0
    left = 0
    for arr in matrix:
        left += int(arr[index_left])
        right += int(arr[index_right])
        index_right -= 1
        index_left += 1
    return print(left - right)

# main(['190', '828', '373'])

n = int(input())
for x in range(n):
    i = int(input())
    matrix = []
    for x in range(i):
        s = input()
        matrix.append(s)
    main(matrix)
    matrix = []
    
