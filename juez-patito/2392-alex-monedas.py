# Alex jhon  y las monedas




def main(list_nums, index):
    nums = sorted(list_nums)
    counter = 0
    # trash = {}
    rem1 = []
    rem2 = []
    for i in range(0, index):
        if i + 1 <= int(nums[i]):
            counter += 1
        else:   
            rem1.append(i + 1)
            rem2.append(nums[i])

    if len(rem1) < 1:
        return print(counter)
    
    for i in rem1:
        for j in rem2:
            if i <= j:
                counter += 1
    print(counter)



n = int(input())

for x in range(n):
    i = int(input())
    arr = map(int, input().split())
    main(arr, i)
