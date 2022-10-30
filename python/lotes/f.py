


def primeNumber(num):
    if num > 2 and num % 2 == 0:
        return False
    res = []
    for n in range(2, num + 1):
        if num % n == 0:
            res.append(n)
    if len(res) > 1:
        return False
    else:
        return True


# -------- RUNNING CODE --------

counter = 0 
sum_of_prime_nums = 0
results_counter = 0 # to detect if there were at lest 3 prime numbers or not

while True:
    n = int(input())
    if n == -1:
        if results_counter < 1:
            print("No hubo ningun promedio de primos.")
        break 
    if primeNumber(n):
        sum_of_prime_nums += n 
        counter += 1
        if counter == 3:
            averaged = sum_of_prime_nums / 3
            print(int(averaged))
            counter = 0
            sum_of_prime_nums = 0
            results_counter += 1 
    
         




