




def getMaxNumber(arr):
    max_number = 0
    for item in arr:
        if item > max_number:
            max_number = item
    return max_number

def getNumbersFromMainArr(index, arr):
    index_counter = index 
    new_arr = []
    while len(new_arr) <= 3:
        new_arr.append(arr[index_counter])
        index_counter += 1
        
    return new_arr

def main(arr):
    if len(arr) < 4: # valudation to avoid bug "index out of range"
        return print(getMaxNumber(arr))
    index = 0
    while index <= (len(arr) - 4):
        result = getMaxNumber(getNumbersFromMainArr(index, arr))
        print(result)
        index += 1


# main([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20])




# ---------- RUNNING CODE ------------



n = int(input())

res = []
for x in range(n):
    a = int(input())
    res.append(a)
main(res)
