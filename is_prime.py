

def is_prime(n):
    if n <= 1:
        return False
    
    all_prime_numbers = [2,3,5,7,11,13,17,19,23,29]

    if n in all_prime_numbers:
        return True


    for num in all_prime_numbers:
        if n % num == 0:
            return False

    for num in range(2, int(n ** 0.5) + 1):
        if n % num == 0:
            return False

    all_prime_numbers.append(n)

    return True
    
is_prime(5) # true
is_prime(22) # false


# num = 2

# res = []

# while len(res) < 100000:
#     if is_prime(num):
#         res.append(num)

#     num += 1

# print(res[len(res) - 1])







