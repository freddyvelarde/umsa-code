
def main(nums):
    pivot = nums.pop()
    res = 0
    a = []
    for i, num in enumerate(nums):
        if res == pivot:
            break
        res += num
        a.append(num)
        if res > pivot:
            res -= nums[i - 1]
            a.pop()
            

    print(a)

main([1, 3, 4, 4, 5, 7, 8])
main([1, 1, 2, 999999998, 999999999, 999999999, 1000000000])


