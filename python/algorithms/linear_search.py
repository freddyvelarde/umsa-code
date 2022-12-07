
def linear_search(list, value):
    index = 0
    for num in list:
        if num == value:
            return index
        index += 1

arr = [1,2,3,4,5,6,7,8,9,10]
print(linear_search(arr, 10))
