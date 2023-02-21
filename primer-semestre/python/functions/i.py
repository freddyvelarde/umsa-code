def get_sequence(num):
    nums = []
    for i in range(0, num + 1):
        for x in range(2):
            if len(nums) == num:
                break
            nums.append(i)
    final_res = ''
    for num in nums:
        final_res += str(num) + ' '
    print(final_res) 

# RUNNING CODE 

t = int(input())

for x in range(t):
    n = int(input())
    get_sequence(n)
