#  Welcome to the party

def sum_arr(list):
    res = 0
    for num in list:
        res += num
    return res
            


# RUNNING CODE 
n = int(input())

res = []
matrix = []
index = 0
counter = 1
for x in range(n):
    a = int(input())
    res.append(a)
    if len(res) == counter:
        matrix.append(res)
        index += 1 
        counter += index
        res = [] 
# print(matrx)
index = 1
for nums in matrix:
    print("Grupo {} :".format(index), sum_arr(nums))
    index += 1
    
