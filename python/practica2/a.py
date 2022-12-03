def is_prime_number(num):
    if num <= 1:
        return False

    if num > 2 and num % 2 == 0:
        return False

    if num > 3 and num % 3 == 0:
        return False

    if num > 5 and num % 5 == 0:
        return False


    if num > 7 and  num % 7 == 0:
        return False
    

    if num > 11 and num % 11 == 0:
        return False
    
    if num > 13 and  num % 13 == 0:
        return False


    counter = 0
    for x in range(2, num + 1):
        if counter > 1:
            return False
        if num % x == 0:
            counter += 1
    return True

def find_prime_numbers(nums):
    res = ''
    for num in nums:
        if is_prime_number(int(num)):
            res += num 
    if len(res) == 0:
        return print(-1)
    return print(res)


# RUNNING CODE 
n = int(input())

for x in range(n):
    s = input()
    find_prime_numbers(s)


