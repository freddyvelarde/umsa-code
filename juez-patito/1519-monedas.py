

def print_nums(list):
    res = ''
    for num in list:
        res += str(num) + ' ' 

    return print(res[:-1])

def get_sequence(n):
    num_base = 5
    res = 1
    nums = []

    for num in range(n):
        nums.append(res)
        res += num_base
        num_base += 4
        
    
    return print_nums(nums)

# RUNNING CODE 

n = int(input())

for _ in range(n):
    a = int(input())
    get_sequence(a)


