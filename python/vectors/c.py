def invert_values(list, i, j):
    values = {}
    index = j
    stop  = i
    index_value = i
    while index >= stop:
        values[index_value] = list[index]
        index -= 1
        index_value += 1
    
    new_arr = []
    for i in range(0,len(list)): 
        if i in values :
            new_arr.insert(i, values[i])
        else: 
            new_arr.append(list[i])
    for x in new_arr:
        print(x)

a,b,c = map(int, input().split())
arr = input().split()

invert_values(arr, b , c)
# invert_values([1,2,3,4,5,6,7,8,9,10], 2, 4) # -> 1 2 5 4 3 6 7 8 9 10 
    
