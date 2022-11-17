

def main(list1, list2):
    nums = []
    for num in list2: 
        if num in list1:
            nums.append(num)
    if len(nums) == 0:
        return print(-1)

    min_num = nums[0]
    for num in nums:
        if num <= min_num:
            min_num = num 
    print(min_num)

# RUNNING CODE 
n = int(input())

for x in range(n):
    a, b = map(int, input().split())
    arr1 = input().split(' ')
    arr2 = input().split(' ')
    main(arr1, arr2)

