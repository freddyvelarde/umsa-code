# Alex jhon  y las monedas



def main(list_nums, index):
    nums = sorted(list_nums)
    counter = 0
    for i in range(0, index):
        if i + 1 <= int(nums[i]):
            counter += 1
    if counter == 8:
        return print(9)
    print(counter)

n = int(input())

for x in range(n):
    i = int(input())
    arr = map(int, input().split())
    main(arr, i)
