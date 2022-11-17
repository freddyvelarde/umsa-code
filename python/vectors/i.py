def quick_sort(nums):
    if len(nums) < 1:
        return nums
    pivot = nums.pop()
    greater = []
    lower = []
    for num in nums:
        if int(num) >= pivot:
            greater.append(num)
        else:
            lower.append(num)
    return quick_sort(lower) + [pivot] + quick_sort(greater)

def deleteDuplicated(nums):
    data = {}

    for num in nums:
        if num in data: 
            data[num] += 1
        else:
            data[num] = 1
    new_arr = []
    for key in data:
        new_arr.append(data[key])    
    return new_arr
    


def main(nums_list):
    print(nums_list)
    if len(nums_list) == 1:
        return print(nums_list[0])
    # clean_nums = list(set(quick_sort(nums_list)))
    clean_nums = deleteDuplicated(quick_sort(nums_list))
    print(clean_nums)
    if len(clean_nums) % 2 == 0:
        return print(-1)
    media = (len(clean_nums) - 1) / 2
    
    greater = 0
    lower = 0
    same = 0
    print(nums_list)
    # for num in nums_list:
    #     print(num)
        # if num > clean_nums[int(media)]:
        #     greater += 1
        # elif num < clean_nums[int(media)]:
        #     lower += 1
        # elif num == clean_nums[int(media)]:
        #     same += 1
    # print(greater, lower, clean_nums[int(media)], media) 
    # if greater == lower and same == 1:
    #     return print(clean_nums[int(media)])
    # print(-1)
    
# ---------- RUNNING CODE -----------
index = 1
while True:
    try:
        n = input().split()
        if len(n) < 1:
            break 
        desired_array = [int(numeric_string) for numeric_string in n]
        if index % 2 == 0:
            main(desired_array)
        index += 1
    except EOFError:
        break


# main([1, 4, 2, , 7 ])
# main([1, 5, 8, 3  ])
# main([1, 2, 2, 3, 4 ])
