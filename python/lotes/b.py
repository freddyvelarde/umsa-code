

def isPrimeNumber(num):
    if num > 2 and  num % 2 == 0:
        return False
    res = []
    for n in range(2, num + 1):
        if num % n == 0:
            res.append(n)
    if len(res) > 1:
        return False
    else: 
        return True


n = int(input())

prime_numbers_couters = 0
for x in range(n):
    a = int(input())
    if isPrimeNumber(a):
        prime_numbers_couters += 1
print(prime_numbers_couters)


