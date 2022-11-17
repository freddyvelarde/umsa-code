
def removing_elements(list):
    data = {}

    for num in list:
        if num in data:
            data[num] += 1
        else:
            data[num] = 1
    res = 0
    for key in data:
        if data[key] >= res:
            res = data[key]
    print(len(list) - res)

# removing_elements([3, 3, 2, 1, 3])
# removing_elements([5,2,2,2,2,2,5,5,5,5,5])

# -------- RUNNING CODE -----------
n = int(input())
arr = input().split()

removing_elements(arr)
