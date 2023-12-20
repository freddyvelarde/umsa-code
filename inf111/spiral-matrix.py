

def main(n, m):
    matrix = [[0 for _ in range(m)] for _ in range(n)]

    col, row, height, width = 0, 0, n, m

    num = 1
    while height >= 1 or width >= 1:

        for _ in range(width):
            matrix[row][col] = num
            col += 1
            num += 1
        col -= 1
        row += 1

        for _ in range(height - 1):
            matrix[row][col] = num
            num += 1
            row += 1
            # print('hello')
        col -= 1
        row -= 1

        for _ in range(width - 1):
            matrix[row][col] = num
            num += 1
            col -= 1
        col += 1
        row -= 1

        for _ in range(height - 2):
            matrix[row][col] = num
            row -= 1
            num += 1
        row += 1
        col += 1

        height -= 2
        width -= 2

        # width = 0
        # print(col, row)
        # break

    # print(n)
    for arr in matrix:
        print(arr)

a, b = map(int, input().split())
# height, width
main(a, b)
