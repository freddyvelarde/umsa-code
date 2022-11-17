def quick_sort(list):
    if len(list) == 0: 
        return list 

    pivot = list.pop()
    
    greater_nums = []
    
    lower_nums = []
    
    for num in list:
        if num >= pivot:
            greater_nums.append(num)
        else:
            lower_nums.append(num)
    return quick_sort(lower_nums) + [pivot] + quick_sort(greater_nums)


def main(nums):
    nums_list = quick_sort(nums)
    res = ''
    for num in nums_list:
        res += str(num) + ' '
    print(res)
    return res 

# ---------- RUNNING CODE -------

n = int(input())
index = 1

for a in range(n*2):
    x = input().split()
    # print(x)
    if index % 2 == 0:
        main(x)
    index += 1
