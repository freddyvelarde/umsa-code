def max_number(arr):
    max = arr[0]
    for num in arr:
      
        if num >= max:
            max = num
    return max 

def arr_to_str(arr):
    res = ''
    for num in arr:
        res += str(num) + ' '
    return res[:-1]




def main(matrix):
    max_nums = []
    print('matriz de entrada:')
    for arr in matrix:
        print(arr_to_str(arr))
        max_nums.append(max_number(arr))

    print('vector de salida:')
    return print(arr_to_str(max_nums))

# RUNNING CODE 

a, b = map(int, input().split())
matrix = []
for x in range(a):
    nums = list(map(int, input().split()))
    matrix.append(nums)

main(matrix)

