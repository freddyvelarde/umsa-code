import math


def sieve_of_eratosthenes(start, n):
    primes = [True] * (n - start + 1)
    prime_list = []

    sqrt_n = int(math.sqrt(n))
    for p in range(2, sqrt_n + 1):
        i = max(2, (start + p - 1) // p)
        for j in range(i * p, n + 1, p):
            if j >= start:
                primes[j - start] = False

    for i in range(len(primes)):
        if primes[i]:
            prime_list.append(i + start)

    return prime_list


def is_prime(n, primes):
    if n <= 1:
        return False

    for p in primes:
        if n == p:
            return True
        elif n % p == 0:
            return False

    for i in range(int(math.sqrt(n)) + 1):
        p = primes[i]
        if n % p == 0:
            return False

    primes.append(n)
    return True


def main():
    data = {}

    fib = [0] * 1000
    fib[0] = 0
    fib[1] = 1
    data[0] = 0
    data[1] = 1

    primes = sieve_of_eratosthenes(2, 100000)

    #  print(len(primes))

    # Uncomment the code block below to translate the rest of the code

    for i in range(2, 1000):
        fib[i] = fib[i - 1] + fib[i - 2]
        data[i] = fib[i]

    while True:
        try:
            x = int(input())
            num = data[x]
            if x >= 51:
                if is_prime(x, primes):
                    print("Probablemente sea primo")
                else:
                    print("No es primo")
                continue
            if is_prime(num, primes):
                print("Es primo")
            else:
                print("No es primo")
        except EOFError:
            break


if __name__ == "__main__":
    main()
