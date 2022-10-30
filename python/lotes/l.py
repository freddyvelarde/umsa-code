# helpers
def numToArr(n):
    num_to_str = str(n)
    res = []
    for char in num_to_str:
        res.append(int(char))

    return res

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr.pop()
    lower_nums = []
    greater_nums = []

    for num in arr:
        if num >= pivot: 
            greater_nums.append(num)
        else:
            lower_nums.append(num)
    return quick_sort(lower_nums) + [pivot] + quick_sort(greater_nums)
    # recursion

def main(num):
    num_to_arr = numToArr(num)         
    if len(num_to_arr) > 2:
        result_arr = quick_sort(num_to_arr) 
        num3 = result_arr[len(result_arr) - 1]
        num2 = result_arr[len(result_arr) - 2]
        num1 = result_arr[len(result_arr) - 3]

        final_res = '{} {} {}'.format(num1, num2, num3)
        print(final_res)

# ------------ RUNNING CODE -------------


n = int(input())

for a in range(n):
    a = int(input())
    main(a)
