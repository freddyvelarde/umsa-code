def string_to_numsArr(string):
    nums = []
    for char in string:
        nums.append(int(char))
    return nums

def rows(matrix):
    index = 0
    res = ''
    for arr in matrix:
        counter = 0
        for num in arr:
            if num == 1:
                counter += 1

        if counter % 2 == 0:
            res += str(index) + ' '
        counter = 0
        index += 1

    if res == '':
        return print("Ninguna fila tiene un par de unos.")
    return print(res[:-1])
        

def columns(matrix):
    res = ''
    index = 0
    for x in range(len(matrix)):
        counter = 0
        for arr in matrix:
            if arr[index] == 1: 
                counter += 1
        
        if counter > 0 and counter % 2 == 0:
            res += str(index) + ' '
        counter = 0
        index += 1
    
    if res == '':
        return print("Ninguna columna tiene un par de unos.")
    return print(res[:-1])

# RUNNING CODE 

n = int(input())
matrix = []
for x in range(n):
    nums = input()
    matrix.append(string_to_numsArr(nums))

rows(matrix )
columns(matrix)
    
    
