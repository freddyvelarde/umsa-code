def is_prime_number(x):
    if x <= 1:
        return False

    if x > 2 and x % 2 == 0:
        return False 

    if x > 3 and x % 3 == 0:
        return False 

    if x > 5 and x % 5 == 0:
        return False 

    if x > 7 and x % 7 == 0:
        return False 

    if x > 11 and x % 11 == 0:
        return False 

    if x > 13 and x % 13 == 0:
        return False 

    if x > 17 and x % 17 == 0:
        return False 

    if x > 19 and x % 19 == 0:
        return False 
    
    if x > 23 and x % 23 == 0:
        return False 

    if x > 29 and x % 29 == 0:
        return False 

    if x > 31 and x % 31 == 0:
        return False 

    if x > 37 and x % 37 == 0:
        return False 
    
    for i in range(2, int(x ** 0.5) + 1):
        if x % i == 0:
            return False
    return True

# print(is_prime_number(3614186083))
# print(is_prime_number(98))
# print(is_prime_number(7677112571))
# print(is_prime_number(254))
# print(is_prime_number(9118745303))
# print(is_prime_number(222))
# print(is_prime_number(9246121043))
# print(is_prime_number(7892))
# print(is_prime_number(2679260417))

def main(matrix):
    counter = 0
    for arr in matrix:
        for num in arr:
            if is_prime_number(num):
                counter += 1
    print(counter)

a, b = map(int, input().split())
matrix = []
for x in range(a):
    arr = list(map(int, input().split()))
    matrix.append(arr)

main(matrix)

            
