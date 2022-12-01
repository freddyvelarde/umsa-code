def columns(matrix):
    index = 0
    new_matrix = []
    for x in range(len(matrix)):
        new_arr = []
        for arr in matrix:
            new_arr.append(arr[index])
        new_matrix.append(new_arr)
        new_arr =  []
        index += 1
    
    return new_matrix

def main(matrix1, matrix2):
    mat1 = ''
    mat2 = ''
    for i in range(len(matrix1)):
        for j in range(len(matrix2)):
            mat2 += str(matrix2[i][j])
            mat1 += str(matrix1[i][j])
            

    if mat1 != mat2:
        return print("No simetrica")
    return print("Simetrica")
    # print(mat1)
    # print(mat2)
        
    


# RUNNING CODE 

n = int(input())
for x in range(n):
    matrix = []
    a = int(input())
    for x in range(a):
        nums = list(map(int, input().split()))
        matrix.append(nums)
    main(matrix, columns(matrix))

