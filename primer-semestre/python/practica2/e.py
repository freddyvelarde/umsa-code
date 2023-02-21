def quick_sort(nums):
    if len(nums) <= 1:
        return nums 
    pivot = nums.pop()
    left = []
    right = []
    for num in nums:
        if num > pivot:
            right.append(num)
        else:
            left.append(num)
    return quick_sort(left) + [pivot] + quick_sort(right)

def intersection(lst1, lst2):
    lst3 = [value for value in lst1 if value in lst2]
    new_nums = []
    for num in lst3:
        if num not in new_nums:
            new_nums.append(num)
    return quick_sort(new_nums)
    
 
# RUNNING CODE 

n =  int(input())
for x in range(n):
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    print(intersection(a, b))
